package Seminar2;

/*
Дан следующий код, исправьте его там, где требуется
 */
// Исходный код
// public static void main(String[] args) throws Exception {
//     try {
//         int a = 90;
//         int b = 3;
//         System.out.println(a / b);
//         printSum(23, 234);
//         int[] abc = { 1, 2 };
//         abc[3] = 9;
//     } catch (Throwable ex) {
//         System.out.println("Что-то пошло не так...");
//     } catch (NullPointerException ex) {
//         System.out.println("Указатель не может указывать на null!");
//     } catch (IndexOutOfBoundsException ex) {
//         System.out.println("Массив выходит за пределы своего размера!");
//     }
//  }
//  public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//     System.out.println(a + b);
//  } 

public class Task_2_3 {

    // Не указываем throws Exception, т.к. метод main не обрабатывается вышестоящим кодом
    //public static void main(String[] args) throws Exception {
    public static void main(String[] args) {
        
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        // Меняем местами последовательность catch, т.к. общий родитель исключений Throwable должен обрабатываться последним
        } catch (ArithmeticException ex) {
            System.out.println("Делить на 0 нельзя!");//если b будет = 0, нужно обработать
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    // Убрано объявление throws, так как main не обрабатывает это исключение
    //public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    public static void printSum(Integer a, Integer b) {
            System.out.println(a + b);
        }
}


