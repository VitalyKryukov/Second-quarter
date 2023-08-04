package hw3;

import java.util.Comparator;

/**
 * Связный список
 * @param <T>
 */
public class LinkedList<T> {

    /**
     * Ссылка на первый элемент связного списка
     */
    private Node head;

    /**
     * Узел
     */
    class Node{

        /**
         * Ссылка на следующий элемент связного списка
         */
        public Node next;

        /**
         * Значение
         */
        public T value;

    }

    /**
     * Добавление нового элемента в начало связного списка
     * @param value значение
     */
    public void addFirst(T value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        head = node;
    }

    /**
     * Удалить первый элемент связного списка
     */
    public void removeFirst(){
        if (head != null){
            head = head.next;
        }
    }

    public T contains(T value){
        Node node = head;
        while (node != null){
            if (node.value.equals(value))
                return node.value;
            node = node.next;
        }
        return null;
    }

    /**
     * Сортировка (выбором)
     */
    public void sort(Comparator<T> comparator){
        Node node = head;
        while (node != null){

            Node minValueNode = node;

            Node node2 = node.next;
            while (node2 != null){
                if (comparator.compare(minValueNode.value, node2.value) > 0){
                    minValueNode = node2;
                }
                node2 = node2.next;
            }

            if (minValueNode != node){
                T buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }

            node = node.next;
        }
    }

    /**
     * Добавление значения в конец связного списка
     * @param value значение
     */
    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
        }
        else {
            Node lastNode = head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    /**
     * Удаление элемента из конца связного списка
     */
    public void removeLast(){
        if (head == null)
            return;
        Node node = head;
        while (node.next != null){
            if (node.next.next == null){
                node.next = null;
                return;
            }
            node = node.next;
        }
        head = null;
    }

    /*
     * Развернуть связный список
     */
    public void revert() {
            
        // Исключения - нет элементов или есть только один элемент
        if (head == null || head.next == null)
            return;
        
        revert(head.next, head);
    }
    
    // Передаём текущий и предыдущий элемент
    private void revert(Node node, Node prevNode) {
        
        // Дошли до конца, ставим последнему элементу ссылку на head
        if (node.next == null)
            head = node;
        
        // Пускаем в рекурсию следующую пару
        else 
            revert(node.next, node);
        
        // Со следующего элемента делаем ссылку на предыдущий
        node.next = prevNode;
        
        // Чтобы в итоге next последнего элемента в списке имел ссылку на null
        prevNode.next = null;
    }
    // /Разворачиваем связный список -----------------------
    

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null){
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }
        return stringBuilder.toString();
    }
}