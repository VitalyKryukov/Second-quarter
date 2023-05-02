package Classes;



public class OrdinaryClient extends Actor {
    /**
     * Унаследованный конструктор из класса Actor
     * @param name -имя клиента
     */
    public OrdinaryClient(String name){
        super(name);
    }
    /**
     * Имплементированный метод с реализацией из класса Actor
     */
    @Override
    public String getName() {
        return super.name;
    }
    /**
     * Статус клиента: делал ли он заказ
     * @return
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**
     * Статус клиента: получил ли он заказ
     * @return
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /**
     * Статус клиента: делал ли он заказ
     * @param makeOrder
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
        
    }
    /**
     * Статус клиента: забрал ли он заказ
     * @param pickUpOrder
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
        
    }

    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
    
    @Override
    public boolean isGetMony() {
        return super.isGetMony;
    }

    @Override
    public Actor getActor() {
        return this;
    }
    

}
