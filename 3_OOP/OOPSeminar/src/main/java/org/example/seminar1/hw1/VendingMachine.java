package org.example.seminar1.hw1;

/**
 * Интерфейс торгового автомата
 */
public interface VendingMachine {
    /**
     * Внесение продуктов в торговый автомат
     */
    void initProduct();

    /**
     * Получение продукта из торгового автомата
     * @return строку
     */
    String getProduct();
}
