package org.example.seminar1.cw1.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainVM {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Product> products = new ArrayList<>(Arrays.asList(new Product("pepsi", 42),
                new Product("chocalate", 67),
                new Product("cola", 70)));
        vendingMachine.intProduct(products);
        System.out.println(vendingMachine.getProduct("cola").toString());
    }
}
