package Interfases;

import java.util.List;

public interface iMarketBehaviour {
    void setPromotionalLimit(String shareName, int limit);
    /**
     * Метод: "Клиент пришел в магазин"
     * @param actor - имя клиента
     */
    void acceptToMarket(iActor actor);
    /**
     * Метод: "Клиент ушел из магазина"
     * @param actors - имя клиента
     */
    void releaseFromMarket(List<iActor> actors);
    /**
     * Метод обновления статутса магазина
     */
    void update();
}
