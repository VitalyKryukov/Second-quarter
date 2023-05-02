package Interfases;

import Classes.Actor;

public interface iQueueBehaviour {
    /**
     * Клиент встал в очередь
     * @param actor - клиент
     */
    void takeInQueue (iActorBehaviour actor);
    /**
     * Клиент ушел из очереди
     */
    void releaseFromQueue();
    /**
     * Клиент сделал заказ
     */
    void takeOrder();
    /**
     * Клиент забрал заказ
     */
    void giveOrder();


}
