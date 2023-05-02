package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfases.iMarketBehaviour;
import Interfases.iQueueBehaviour;

public class Market0 implements iMarketBehaviour,iQueueBehaviour {
    /**
     * Создаем лист клиентов из класса родителя
     * @param queue - очередь клиентов
     */
    private List<Actor> queue;
    /**
     * Конструктор для класса Market 
     * @param queue - создаем очередь клиентов (выделяем память под нее)
     */
    public Market0() {
        this.queue = new ArrayList<Actor>();
    }   
    /**
     * Имплементированный метод с реализацией: "Добавление клиента в очередь магазина"
     * @param actor - клиент
     */
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }  
    /**
     * Клиент добавлен в очередь
     * @param actor
     */
    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName()+" клиент добавлен в очередь ");
        this.queue.add(actor);
    }  
    /**
     * Имплементированный метод с реализацией: "Удаление клиента из очереди магазина"
     * @param actors клиент
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }
    /**
     * Текущий статус клиента
     */
    @Override
    public void update() {
        takeOrder();//кто забрал
        giveOrder();//кто заказал.
        releaseFromQueue();//кто ушел из очереди
    }
    /**
     * Удаление клиентов из очереди
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor: queue) {
            if (actor.isTakeOrder()){
                releaseActors.add(actor);
                System.out.println(actor.getName()+" клиент ушел из очереди ");
            }
        }
    releaseFromMarket(releaseActors);
    }
    /**
     * Статус клиента: получение заказа
     */
    @Override
    public void giveOrder() {
        for (Actor actor : queue) {
           if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName()+" клиент получил заказ ");
           } 
        }
    } 
    /**
     * Статус клиента: заказ товара
     */
    @Override
    public void takeOrder() {
        for ( Actor actor : queue) {
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName()+" клиент сделал заказ ");
            }
        }
    }
    
}
