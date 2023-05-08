package Interfases;

public interface iReturnOrder {
    /**
     * Клиент вернул товар
     */
    void returnOrder();
    /**
     * Клиент получил деньги
     */
    void getMoney();

    /**
     * Статус клиента: вернул ли он заказ
     * @return
     */
    boolean isReturnOrder();
    /**
     * Статус клиента: получил ли он деньги за возврат
     * @return
     */
    boolean isGetMoney();

}
