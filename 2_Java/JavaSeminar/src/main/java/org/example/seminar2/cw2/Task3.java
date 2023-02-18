package org.example.cw2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //3) Дан массив целых чисел.
        // Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            System.out.println("вход");
            if(mass[i]==2*mass[i+1]){
                k++;
            }
        }
        scanner.close();
        System.out.println("k= "+k);
    }
}
