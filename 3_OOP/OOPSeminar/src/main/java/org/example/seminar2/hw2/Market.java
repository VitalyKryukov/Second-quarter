package org.example.seminar2.hw2;

import java.util.*;

public class Market implements QueueBehaviour ,MarketBehaviour{
    List <Buyer> actors = new ArrayList<>();
    Queue<Buyer> actrosQueue = new ArrayDeque<>();

    /**
     * Переопределенный метод интерфейса MarketBehaviour
     * фиксирует вход покупателя в магазин
     * @param actor покупатель
     */
    @Override
    public void acceptToMarket(Buyer actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        actors.add(actor);
    }

    /**
     * Переопределенный метод интерфейса MarketBehaviour
     * фиксирует выход покупателя из магазина
     * @param actor покупатель
     */
    @Override
    public void replaceFromMarket(Buyer actor) {
        System.out.println(actor.getName() + " вышел из магазина");
        actors.remove(0);
    }

    /**
     * Переопределенный метод интерфейса MarketBehaviour
     */
    @Override
    public void update() {

    }
    /**
     * Перегруженный метод
     * Инкапсулирует использованные методы для исключения ошибочного использования
     * @param actor покупателя
     */
    public void update(Buyer actor) {
        acceptToMarket(actor);
        takeInQueue(actor);
        takeOrders();
        giveOrders();
        replaceFromQueue();
        replaceFromMarket(actor);
    }

    /**
     * Переопределенный метод интерфейса QueueBehaviour
     * реализует постановку покупателя в очередь
     * @param actor покупатель
     */
    @Override
    public void takeInQueue(Buyer actor) {
        System.out.println(actor.getName() + " встал в очередь");
        actrosQueue.add(actor);
    }

    /**
     * Переопределенный метод интерфейса QueueBehaviour
     * реализует оформление заказа
     */
    @Override
    public void takeOrders() {
        actrosQueue.element().isTakeOrder();
        System.out.println(actrosQueue.element().getName() + " оформил заказ");
    }

    /**
     * Переопределенный метод интерфейса QueueBehaviour
     * реализует получение заказа
     */
    @Override
    public void giveOrders() {
        actrosQueue.element().setMakeOrder();
        System.out.println(actrosQueue.element().getName() + " забрал заказ");

    }

    /**
     * Переопределенный метод интерфейса QueueBehaviour
     * реализует выход покупателя из очереди
     */
    @Override
    public void replaceFromQueue() {
        System.out.println(actrosQueue.poll().getName() + " покинул очередь");
    }
}
