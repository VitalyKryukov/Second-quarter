package Interfases;

import Classes.Actor;

public interface iActorBehaviour {
    /**
     * Клиент сделал заказ
     * @param makeOrder сделать заказ
     */
    void setMakeOrder(boolean makeOrder);
    /**
     * Клиент забрал заказ
     * @param pickUpOrder забрать заказ
     */
    void setTakeOrder(boolean pickUpOrder);
    /**
     * Статус клиента: делал ли он заказ
     * @return
     */
    boolean isMakeOrder();
    /**
     * Статус клиента: забрал ли он заказ
     * @return
     */
    boolean isTakeOrder();
    /**
     * Статус клиента: вернул ли он заказ
     * @return
     */
    boolean isReturnOrder();
    /**
     * Статус клиента: получил ли он деньги за возврат
     * @return
     */
    boolean isGetMony();
    /**
     * Вернуть имя клиента
     * @return имя клиента
     */
    Actor getActor();
}
