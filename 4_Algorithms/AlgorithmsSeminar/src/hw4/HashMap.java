package hw4;

import java.util.Iterator;

public class HashMap<K, V> implements Iterable<HashMap.Entity> {

    private static final int INIT_BUCKET_COUNT = 16;
    private static final double LOAD_FACTOR = 0.5;
    private int size = 0;


    private Bucket[] buckets;

    @Override
    public HashMap<K, V>.HashMapIterator iterator() {
        return new HashMapIterator();
    }

    // Итератор для перебора элементов хэш-карты
    class HashMapIterator implements Iterator<HashMap.Entity>{

        int bucketIndex = 0; // Индекс текущего бакета
        int nodeIndex = 0;  // Индекс текущей ноды в бакете
        Entity entity;
        
        @Override
        public boolean hasNext() {
            // Перебираем все бакеты с того, на котором остановились
            for (int i = bucketIndex; i < buckets.length; i ++) {
                Bucket<K, V> bucket = buckets[i];
                if (bucket != null) {
                    // Перебираем связный список в бакете с той ноды, на которой остановились
                    Bucket.Node node = bucket.head;
                    int j = 0;
                    while (node != null) {
                        if (j < nodeIndex) {
                            j ++;
                            node = node.next;
                            continue;
                        }
                        entity = new Entity();
                        entity.key = (K)node.value.key;
                        entity.value = (V)node.value.value;
                        nodeIndex ++;
                        return true;
                    }
                    
                    nodeIndex = 0;
                }                
                                
                bucketIndex ++;
            }
            
            // Все элементы перебраны, возвращаем false
            return false;
        }

        // Переходим к следующему элементу перед возвратом текущего
        @Override
        public Entity next() {
            return entity;
        }
    }
    // Внутренний класс для представления элемента хэш-карты
    class Entity{
        K key;
        V value;
    }
    // Внутренний класс для представления бакета
    class Bucket<K, V>{

        private Node head;
        class Node{
            Node next;
            Entity value;
        }
        // Добавление элемента в бакет
        public V add(Entity entity){
            Node node = new Node();
            node.value = entity;

            if (head == null){
                head = node;
                return null;
            }

            Node currentNode = head;
            while (true){
                if (currentNode.value.key.equals(entity.key)){
                    V buf = (V)currentNode.value.value;
                    currentNode.value.value = entity.value;
                    return buf;
                }
                if (currentNode.next != null){
                    currentNode = currentNode.next;
                }
                else {
                    currentNode.next = node;
                    return null;
                }
            }

        }
        // Удаление элемента из бакета по ключу
        public V remove(K key){
            if (head == null)
                return null;
            if (head.value.key.equals(key)){
                V buf = (V)head.value.value;
                head = head.next;
                return buf;
            }
            else {
                Node node = head;
                while (node.next != null){
                    if (node.next.value.key.equals(key)){
                        V buf = (V)node.next.value.value;
                        node.next = node.next.next;
                        return buf;
                    }
                    node = node.next;
                }
                return null;
            }
        }
        // Получение значения элемента из бакета по ключу
        public V get(K key){
            Node node = head;
            while (node != null){
                if (node.value.key.equals(key))
                    return (V)node.value.value;
                node = node.next;
            }
            return null;
        }


    }
    // Вычисление индекса бакета для заданного ключа
    private int calculateBucketIndex(K key){
        return Math.abs(key.hashCode()) % buckets.length;
    }
    // Рекалькуляция бакетов при необходимости
    private void recalculate(){
        size = 0;
        Bucket<K, V>[] old = buckets;
        buckets = new Bucket[old.length * 2];
        for (int i = 0; i < old.length; i++){
            Bucket<K, V> bucket = old[i];
            if (bucket != null){
                Bucket.Node node = bucket.head;
                while (node != null){
                    put((K)node.value.key, (V)node.value.value);
                    node = node.next;
                }
            }
        }
    }
    // Добавление элемента в хэш-карту
    public V put(K key, V value){

        if (buckets.length * LOAD_FACTOR <= size){
            recalculate();
        }

        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null){
            bucket = new Bucket();
            buckets[index] = bucket;
        }

        Entity entity = new Entity();
        entity.key = key;
        entity.value = value;

        V res = (V)bucket.add(entity);
        if (res == null){
            size++;
        }
        return res;
    }
    // Удаление элемента из хэш-карты по ключу
    public V remove(K key){
        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null)
            return null;
        V res = (V)bucket.remove(key);
        if (res != null){
            size--;
        }
        return res;
    }
    // Получение значения элемента из хэш-карты по ключу
    public V get(K key){
        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null)
            return null;
        return (V)bucket.get(key);
    }
    // Конструктор без аргументов, создает хэш-карту с начальным размером бакетов
    public HashMap(){
        buckets = new Bucket[INIT_BUCKET_COUNT];

    }
    // Конструктор с заданным начальным размером бакетов
    public HashMap(int initCount){
        buckets = new Bucket[initCount];
    }


}