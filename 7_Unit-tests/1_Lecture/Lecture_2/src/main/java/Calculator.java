import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstOperand = getOperand();
        int secondOperand = getOperand();
        char operator = getOperator();
        int result = calculation(firstOperand, secondOperand, operator);
        System.out.println("Результат выполнения операции: "
                + firstOperand + " " + operator + " " + secondOperand + " = " + result);
    }
    public static char getOperator(){
        System.out.println("Введите оператор: +, -, *, /");
        Scanner scanner = new Scanner(System.in);
        char operator = scanner.next().charAt(0);
        return operator;
    }

    public static int getOperand(){
//        Было до:
//        System.out.println("Введите число: ");
//        Scanner scanner = new Scanner(System.in);
//        int operand = scanner.nextInt();
//        return operand;
        System.out.println("Введите число: ");
        int operand;

        if (scanner.hasNextInt()){
            operand = scanner.nextInt();
        }
        else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте снова.");
            if(scanner.hasNextInt()){
                scanner.next();
                operand = getOperand();
            }
            else{
                throw new IllegalStateException("Ошибка в вводимых данных");
            }
        }
        return operand;
    }
    public static int calculation(int a, int b, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        return result;
    }
}
