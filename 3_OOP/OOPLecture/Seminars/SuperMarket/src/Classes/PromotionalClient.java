package Classes;

import java.util.HashMap;
import java.util.Map;

public class PromotionalClient extends Actor {
    /**
     * @param promotionalClients клиенты акции;
     */
    private static Map<String, Integer> promotionalClients = new HashMap<>();

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
     */
    public PromotionalClient(String name, String shareName) {
        super(name);
        this.shareName = shareName;
        if(promotionalClients.containsKey(shareName)) {
            numPromotionalClient = promotionalClients.get(shareName) + 1;
        } else {
            numPromotionalClient = 0;
        }
        promotionalClients.put(shareName, numPromotionalClient);
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

    public int getCountPromotionalClient(){
        if(promotionalClients.containsKey(shareName)) {
            return promotionalClients.get(shareName);
        } else {
            return 0;
        }
    }

}
