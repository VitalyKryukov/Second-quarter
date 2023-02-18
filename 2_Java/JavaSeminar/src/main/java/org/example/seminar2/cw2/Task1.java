package org.example.cw2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double x;
        int n;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        n = scanner.nextInt();
        double result = 1;
        scanner.close();
        if (n < 0) {
            x = 1 / x;
            n *= -1;
        }
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println("result= " + result);
    }
}