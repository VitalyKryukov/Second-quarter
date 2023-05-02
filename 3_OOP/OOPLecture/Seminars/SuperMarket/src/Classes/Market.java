package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfases.iActorBehaviour;
import Interfases.iMarketBehaviour;
import Interfases.iQueueBehaviour;
import Interfases.iReturnOrder;

public class Market implements iMarketBehaviour,iQueueBehaviour,iReturnOrder {
    
    /**
     * Создаем лист клиентов из класса родителя
     * @param queue - очередь клиентов
     */
    // private List<Actor> queue;
    
    private List<iActorBehaviour> queue;

    /**
     * Конструктор для класса Market 
     * @param queue - создаем очередь клиентов (выделяем память под нее)
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }   
    /** 
     * Имплементированный метод с реализацией: "Добавление клиента в очередь магазина"
     * @param actor - клиент
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }  
    /**
     * Клиент добавлен в очередь
     * @param actor
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
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
        for (iActorBehaviour actor: queue) {
            if (actor.isTakeOrder()){
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
            }
        }
    releaseFromMarket(releaseActors);
    }
    /**
     * Статус клиента: получение заказа
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
           if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил заказ ");
           } 
        }
    } 
    /**
     * Статус клиента: заказ товара
     */
    @Override
    public void takeOrder() {
        for ( iActorBehaviour actor : queue) {
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");
            }
        }
    }
    
    @Override
    public void returnOrder() {
        for ( iActorBehaviour actor : queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" товар принят к возврату ");
            }
        }
    }
    
    @Override
    public void getMoney() {
        for ( iActorBehaviour actor : queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил деньги за возврат товара ");
            }
    }
    }
}
