package Seminar2;

/*
Если необходимо, исправьте данный код
 */


public class Task_2_2 {

    public static void main(String[] args) {
        // Исходный код
        // try {
        //     int d = 0;
        //     double catchedRes1 = intArray[8] / d;
        //     System.out.println("catchedRes1 = " + catchedRes1);
        //  } catch (ArithmeticException e) {
        //     System.out.println("Catching exception: " + e);
        //  }
        
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};//не был инициализирован массив
            int d = 0;
            
            if (d != 0) {
                double catchedRes1 = (double) intArray[8] / d;//привел к double
                System.out.println("catchedRes1 = " + catchedRes1);
            } else {
                System.out.println("Division by zero");
                /*
                 * Результат деления на ноль в данном случае будет Infinity,
                 * так как в Java деление на ноль для чисел с плавающей точкой (double) или с фиксированной точкой (float)
                 * приводит к получению бесконечности (Infinity или -Infinity в зависимости от знака)
                 */
            }
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);//Не было обработано данное исключение
        }
        
    }
}
