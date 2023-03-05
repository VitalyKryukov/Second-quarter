package org.example.seminar1.cw1.task2;

public class BottleOfWater extends Product {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public BottleOfWater(String name, int price) {
        this.name = name;
        this.price = price;
    }


}
