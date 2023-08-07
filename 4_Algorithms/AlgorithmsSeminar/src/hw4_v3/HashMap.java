package hw4_v3;

import java.util.Iterator;

public class HashMap<K, V> implements Iterable<HashMap.Entity<K, V>> {

    private static final int INIT_BUCKET_COUNT = 16;
    private static final double LOAD_FACTOR = 0.5;
    private int size = 0;
    private Bucket<K, V>[] buckets;

    public HashMap() {
        buckets = new Bucket[INIT_BUCKET_COUNT];
    }

    public HashMap(int initCount) {
        buckets = new Bucket[initCount];
    }

    @Override
    public Iterator<Entity<K, V>> iterator() {
        return new HashMapIterator();
    }

    class HashMapIterator implements Iterator<Entity<K, V>> {
        private int bucketIndex = 0;
        private Bucket<K, V>.Node currentNode = null;

        @Override
        public boolean hasNext() {
            while (bucketIndex < buckets.length) {
                if (currentNode == null) {
                    Bucket<K, V> bucket = buckets[bucketIndex];
                    if (bucket != null) {
                        currentNode = bucket.head;
                    }
                } else {
                    if (currentNode.next != null) {
                        currentNode = currentNode.next;
                    } else {
                        currentNode = null;
                        bucketIndex++;
                    }
                }
                if (currentNode != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Entity<K, V> next() {
            if (currentNode == null) {
                throw new IllegalStateException("No more elements.");
            }
            Entity<K, V> entity = new Entity<>();
            entity.key = currentNode.value.key;
            entity.value = currentNode.value.value;
            currentNode = currentNode.next;
            return entity;
        }
    }

    class Entity<K, V> {
        K key;
        V value;
    }

    class Bucket<K, V> {
        private Node head;

        class Node {
            Node next;
            Entity<K, V> value;
        }

        public V add(Entity<K, V> entity) {
            Node node = new Node();
            node.value = entity;

            if (head == null) {
                head = node;
                return null;
            }

            Node currentNode = head;
            while (true) {
                if (currentNode.value.key.equals(entity.key)) {
                    V buf = currentNode.value.value;
                    currentNode.value.value = entity.value;
                    return buf;
                }
                if (currentNode.next != null) {
                    currentNode = currentNode.next;
                } else {
                    currentNode.next = node;
                    return null;
                }
            }
        }

        public V remove(K key) {
            if (head == null)
                return null;
            if (head.value.key.equals(key)) {
                V buf = head.value.value;
                head = head.next;
                return buf;
            } else {
                Node node = head;
                while (node.next != null) {
                    if (node.next.value.key.equals(key)) {
                        V buf = node.next.value.value;
                        node.next = node.next.next;
                        return buf;
                    }
                    node = node.next;
                }
                return null;
            }
        }

        public V get(K key) {
            Node node = head;
            while (node != null) {
                if (node.value.key.equals(key))
                    return node.value.value;
                node = node.next;
            }
            return null;
        }

        // ... остальной код методов Bucket ...

    }

    private int calculateBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    private void recalculate() {
        size = 0;
        Bucket<K, V>[] old = buckets;
        buckets = new Bucket[old.length * 2];
        for (int i = 0; i < old.length; i++) {
            Bucket<K, V> bucket = old[i];
            if (bucket != null) {
                Bucket<K, V>.Node node = bucket.head;
                while (node != null) {
                    put(node.value.key, node.value.value);
                    node = node.next;
                }
            }
        }
    }

    public V put(K key, V value) {
        if (buckets.length * LOAD_FACTOR <= size) {
            recalculate();
        }

        int index = calculateBucketIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket == null) {
            bucket = new Bucket<>();
            buckets[index] = bucket;
        }

        Entity<K, V> entity = new Entity<>();
        entity.key = key;
        entity.value = value;

        V res = bucket.add(entity);
        if (res == null) {
            size++;
        }
        return res;
    }

    public V remove(K key) {
        int index = calculateBucketIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket == null)
            return null;
        V res = bucket.remove(key);
        if (res != null) {
            size--;
        }
        return res;
    }

    public V get(K key) {
        int index = calculateBucketIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket == null)
            return null;
        return bucket.get(key);
    }

    // ... остальной код методов HashMap ...

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        String res = hashMap.put("+79005554433", "Andrey");
        res = hashMap.put("+79005554432", "Aleksey");
        res = hashMap.put("+79005554432", "Daria");
        res = hashMap.put("+79005554433", "Elena");
        res = hashMap.put("+79005554434", "Kostya");
        res = hashMap.put("+79005554435", "Ivan");
        res = hashMap.put("+79005554436", "Olga");
        res = hashMap.put("+79005554437", "Sonya");
        res = hashMap.put("+79005554438", "Masha");
        res = hashMap.put("+79005554439", "Oleg");

        for (HashMap.Entity<String, String> element : hashMap) {
            System.out.println(element.key + " - " + element.value);
        }

    }
}
