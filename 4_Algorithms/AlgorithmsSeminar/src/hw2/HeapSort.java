package hw2;

public class HeapSort {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Построение кучи (перегруппировка массива)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Извлечение элементов из кучи и помещение их в конец массива
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // Процедура для перегруппировки поддерева с корнем i
    // в массиве размером n
    static void heapify(int[] arr, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int leftChild = 2 * i + 1; // Левый дочерний элемент
        int rightChild = 2 * i + 2; // Правый дочерний элемент

        // Если левый дочерний элемент больше корня
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // Если правый дочерний элемент больше, чем наибольший элемент на данный момент
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // Если наибольший элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно процедура heapify на оставшейся куче
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        heapSort(arr);

        System.out.println("Отсортированный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
