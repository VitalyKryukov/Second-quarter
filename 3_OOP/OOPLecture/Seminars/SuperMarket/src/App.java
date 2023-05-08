import Classes.*;
import Interfases.iActor;

public class App {
    public static void main(String[] args) throws Exception {
        // Market market = new Market();
        // OrdinaryClient client1 = new OrdinaryClient("Boris");
        // OrdinaryClient client2 = new OrdinaryClient("Dasha");
        // SpecialClient client3 = new SpecialClient("Konstantin", 01);
        // market.acceptToMarket(client1);
        // market.acceptToMarket(client2);
        // market.acceptToMarket(client3);
        // market.update();

        Market market = new Market();
        market.setPromotionalLimit("Shoe Sale", 1);
        iActor client1 = new OrdinaryClient("Boris");
        iActor client2 = new SpecialClient("Konstantin", 1);
        iActor client3 = new OrdinaryClient("Dasha");
        iActor client4 = new PromotionalClient("Julia", "Shoe Sale");
        iActor client5 = new PromotionalClient("Anna", "Shoe Sale");
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);
        market.acceptToMarket(client5);
        market.update();

    }
}
