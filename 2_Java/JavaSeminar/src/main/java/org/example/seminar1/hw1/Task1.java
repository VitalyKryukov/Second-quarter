package org.example.seminar1.hw1;

import java.util.Scanner;
import java.lang.String;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String name = iScanner.nextLine();
        System.out.println(name);
        String revName = "";
        String noName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            if (name.charAt(i) != ' ') {
                noName += name.charAt(i);
            }
            if (name.charAt(i) == ' ') {
                for (int j = noName.length() - 1; j >= 0; j--) {
                    revName += noName.charAt(j);
                }
                revName += ' ';
                noName = "";
            }
        }
        for (int i = noName.length() - 1; i >= 0; i--){
            if (noName != ""){
                revName += noName.charAt(i);
            }
        }
        System.out.println(revName.trim());
    }
}

