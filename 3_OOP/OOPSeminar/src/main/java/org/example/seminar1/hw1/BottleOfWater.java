package org.example.seminar1.hw1;

import java.math.BigDecimal;

/**
 * Класс бутилированных напитков
 */
public class BottleOfWater extends Drinkables {
    /**
     * Перегруженный конструктор класса Бутилированных напитков
     *
     * @name   Наименование напитка
     * @price  Стоимость напитка
     * @volume Объем напитка
     */
    public BottleOfWater(String name, BigDecimal price, Double volume) {
        super(name, price, volume);
    }
}
