package Classes;

public class PromotionalClient extends Actor {
    /**
     * @param shareName название акции;
     */
    private String shareName;
    /**
     * @param numPromotionalClient номер акционного клиента;
     */
    private int numPromotionalClient;
    /**
     * Конструктор для класса акционного клиента
     * @param name - имя клиента
     * @param shareName - название акции
     * @param numPromotionalClient - номер клиента в акции
     */
    public PromotionalClient(String name, String shareName, int numPromotionalClient) {
        super(name);
        this.shareName = shareName;
        this.numPromotionalClient = numPromotionalClient;
    }
    /**
     * Получить название акции
     * @return название акции
     */
    public String getShareName() {
        return shareName;
    }
    /**
     * Получить номер акционного клиента
     * @return номер акционного клиента
     */
    public int getNumPromotionalClient() {
        return numPromotionalClient;
    }
    /**
     * Получить имя клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

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

}
