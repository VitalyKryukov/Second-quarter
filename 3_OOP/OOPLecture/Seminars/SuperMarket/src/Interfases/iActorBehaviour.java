package Interfases;

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

}
