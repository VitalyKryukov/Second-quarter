package Classes;

import Interfases.iActor;

public class Actor implements iActor {
    /**
     * @param name - имя клиента
     */
    protected String name;
    /**
     * @param isTakeOrder - получил заказ
     */
    protected boolean isTakeOrder = false;
    /**
     * @param isMakeOrder - сделал заказ
     */
    protected boolean isMakeOrder = false;
    /**
     * @param isReturnOrde - вернул товар
     */
    public boolean isReturnOrder = false;
    /**
     * @param isGetMony - получил деньги за возврат
     */
    public boolean isGetMoney = false;

    /**
     * Конструктор
     * @param name - имя клиента
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Статус клиента: делал ли он заказ
     * @return
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }
    /**
     * Статус клиента: получил ли он заказ
     * @return
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
    /**
     * Статус клиента: делал ли он заказ
     * @param makeOrder
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;

    }
    /**
     * Статус клиента: забрал ли он заказ
     * @param pickUpOrder
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        isTakeOrder = pickUpOrder;
    }

    @Override
    public boolean isReturnOrder() {
        return isReturnOrder;
    }

    @Override
    public boolean isGetMoney() {
        return isGetMoney;
    }

    /**
     * Метод получения имени клиента
     * @return - имя клиента
     */
    public String getName(){
        return name;
    }

    @Override
    public void returnOrder() {
        isReturnOrder = true;
    }

    @Override
    public void getMoney() {
        isGetMoney = true;
    }
}
