package org.example.seminar1.hw1;

import java.math.BigDecimal;

/**
 * Класс горячих напитков
 */
public class HotDrinks extends Drinkables {
    private int temp;

    /**
     * Перегруженный конструктор класса горячих напитков
     * @name   Наименование напитка
     * @price  Цена напитка
     * @volume Объем напитка
     * @temp   Температура напитка
     */
    public HotDrinks(String name, BigDecimal price, Double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    /**
     * Получение температуры напитка
     * @return температуру напитка
     */
    public int getTemp() {
        return temp;
    }

    /**
     * Переопределенный метод
     * @return наименование продукта, стоимость, объем и температуру.
     */
    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }
}
