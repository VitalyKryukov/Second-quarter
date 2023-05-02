package Classes;

import Interfases.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    /**
     * @param name - имя клиента
     */
    protected String name;
    /**
     * @param isTakeOrder - получил заказ
     */
    protected boolean isTakeOrder;
    /**
     * @param isMakeOrder - сделал заказ
     */
    protected boolean isMakeOrder;
    /**
     * @param isReturnOrde - вернул товар
     */
    public boolean isReturnOrder;
    /**
     * @param isGetMony - получил деньги за возврат
     */
    public boolean isGetMony;

    /**
     * Конструктор
     * @param name - имя клиента
     */
    public Actor(String name) {
        this.name = name;
    }
    /**
     * Абстрактный метод получения имени клиента
     * @return - имя клиента
     */
    public abstract String getName();

}
