package org.example.seminar1.cw1.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        VendingMachine1 vm = new VendingMachine1();
        List<BottleOfWater> bw = new ArrayList<>(Arrays.asList(new BottleOfWater("pepsi", 42),
                new BottleOfWater("sprite", 67),
                new BottleOfWater("cola", 70)));
        vm.initProduct(bw);
        System.out.println(vm.getProduct("sprite").toString());
    }
}
