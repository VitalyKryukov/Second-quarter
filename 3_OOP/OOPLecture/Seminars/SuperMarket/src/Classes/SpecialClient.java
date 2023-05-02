package Classes;

public class SpecialClient extends Actor {   
    /**
     * @param idVip - ID vip клиента
     */
    private int idVip;
    /**
     * Конструктор SpecialClient
     * @param name имя клиента
     * @param idVip ID vip клиента
     */
    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }
    /**
     * Получить имя клиента
     */
    @Override
    public String getName() {
        return super.name;
    }    
    /**
     * Получение ID клиента
     * @return - ID клиента
     */
    public int getIdVip() {
        return idVip;
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
    public Actor getActor() {
        return this;
    }

    
    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
    
    @Override
    public boolean isGetMony() {
        return super.isGetMony;
    }

}
