package Classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import Interfases.*;

public class Market implements iMarketBehaviour,iQueueBehaviour {
    /**
     * @param logger - объект для сохранения логов работы
     */
    private Logger logger = Logger.getLogger("MyLog");

    /**
     * Создаем лист клиентов из класса родителя
     * @param queue - очередь клиентов
     */
    // private List<Actor> queue;
    
    private List<iActor> queue;

    /**
     *  @param promotionalLimits - предел участников акции
     */
    private Map<String, Integer> promotionalLimits = new HashMap<>();

    /**
     * Конструктор для класса Market 
     */
    public Market() {
        this.queue = new ArrayList<iActor>();
        FileHandler fh;
        try {
            fh = new FileHandler("./market.log");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
    }

    @Override
    public void setPromotionalLimit(String shareName, int limit) {
        promotionalLimits.put(shareName, limit);
    }

    /**
     * Имплементированный метод с реализацией: "Добавление клиента в очередь магазина"
     * @param actor - клиент
     */
    @Override
    public void acceptToMarket(iActor actor) {
        logger.log(Level.INFO, actor.getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }  
    /**
     * Клиент добавлен в очередь
     * @param actor
     */
    @Override
    public void takeInQueue(iActor actor) {
        logger.log(Level.INFO,actor.getName()+" клиент добавлен в очередь ");
        this.queue.add(actor);
    }  
    /**
     * Имплементированный метод с реализацией: "Удаление клиента из очереди магазина"
     * @param actors клиент
     */
    @Override
    public void releaseFromMarket(List<iActor> actors) {
        for (iActor actor : actors) {
            logger.log(Level.INFO,actor.getName()+" клиент ушел из магазина ");
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
        List<iActor> releaseActors = new ArrayList<>();
        for (iActor actor: queue) {
            if (actor.isTakeOrder()){
                releaseActors.add(actor);
                logger.log(Level.INFO,actor.getName()+" клиент ушел из очереди ");
            }
        }
    releaseFromMarket(releaseActors);
    }
    /**
     * Статус клиента: получение заказа
     */
    public void giveOrder() {
        for (iActor actor : queue) {
           if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
               logger.log(Level.INFO,actor.getName()+" клиент получил заказ ");
           } 
        }
    } 
    /**
     * Статус клиента: заказ товара
     */
    public void takeOrder() {
        for ( iActor actor : queue) {
            if(actor instanceof PromotionalClient){
                PromotionalClient client = (PromotionalClient) actor;
                if(client.getNumPromotionalClient() >= client.getCountPromotionalClient()){
                    logger.log(Level.INFO,"Клиенту " + actor.getName()+" отказано в ослуживании из-за превышения участников акции");
                    continue;
                }
            }
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                logger.log(Level.INFO,actor.getName()+" клиент сделал заказ ");
            }
        }
    }

    public void returnOrder() {
        for ( iActor actor : queue){
            if(actor.isTakeOrder()){
                actor.returnOrder();
                logger.log(Level.INFO,actor.getName()+" товар принят к возврату ");
            }
        }
    }

    public void getMoney() {
        for ( iActor actor : queue){
            if(actor.isReturnOrder()){
                actor.getMoney();
                logger.log(Level.INFO,actor.getName()+" клиент получил деньги за возврат товара ");
            }
    }
    }
}
