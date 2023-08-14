package Seminar1;

class Answer1 {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr[4]);
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 10 / 0;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String a = "test";
        int b = Integer.parseInt(a);
    }
}

public class Task_1_1 {
    public static void main(String[] args) {
        Answer1 ans = new Answer1();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
