import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public ComplexNumber readComplexNumber() {
        System.out.println("Введите комплексное число (действительная и мнимая части, разделенные пробелом):");
        double realPart = scanner.nextDouble();
        double imaginaryPart = scanner.nextDouble();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public void displayResult(String operation, ComplexNumber result) {
        System.out.println("Результат " + operation + ": " + result);
    }

    public void closeScanner() {
        scanner.close();
    }
}
