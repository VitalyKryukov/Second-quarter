package hw4_v3;

import java.util.Iterator;

public class HashMap<K, V> implements Iterable<HashMap.Entity> {

    private static final int INIT_BUCKET_COUNT = 16;
    private static final double LOAD_FACTOR = 0.5;
    private int size = 0;

    private Bucket[] buckets;

    @Override
    public Iterator<Entity> iterator() {
        return new HashMapIterator();
    }

    class HashMapIterator implements Iterator<Entity> {

        int bucketIndex = 0; // Index of the current bucket
        int nodeIndex = 0;   // Index of the current node in the bucket
        Entity entity = null;

        @Override
        public boolean hasNext() {

            // Iterate through all the buckets starting from the current one
            for (int i = bucketIndex; i < buckets.length; i++) {

                Bucket<K, V> bucket = buckets[i];

                if (bucket != null) {

                    // Iterate through the linked list in the bucket starting from the current node
                    Bucket.Node node = bucket.head;

                    int j = 0;

                    while (node != null) {

                        if (j < nodeIndex) {
                            j++;
                            node = node.next;
                            continue;
                        }

                        entity = new Entity(node.value.key, node.value.value);
                        nodeIndex++;
                        return true;
                    }

                    nodeIndex = 0;
                }

                bucketIndex++;
            }

            // All elements have been traversed, return false
            return false;
        }

        @Override
        public Entity next() {
            // Move to the next element before returning the current element
            hasNext();
            return entity;
        }
    }

    class Entity {
        K key;
        V value;

        Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    class Bucket<K, V> {

        private Node head;

        class Node {
            Node next;
            Entity value;
        }

        // The rest of the Bucket implementation remains unchanged.
        // ...

    }

    // The rest of the HashMap implementation remains unchanged.
    // ...

}
