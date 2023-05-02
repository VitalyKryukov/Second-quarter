package Interfases;

import java.util.List;
import Classes.Actor;

public interface iMarketBehaviour {
    /**
     * Метод: "Клиент пришел в магазин"
     * @param actor - имя клиента
     */
    void acceptToMarket(iActorBehaviour actor);
    /**
     * Метод: "Клиент ушел из магазина"
     * @param actors - имя клиента
     */
    void releaseFromMarket(List<Actor> actors);
    /**
     * Метод обновления статутса магазина
     */
    void update();
}
