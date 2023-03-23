import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachineBottle vmBottle = new VendingMachineBottle();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleOfWater(prod.Cola.toString(), new BigDecimal(300), 0.5),
                new BottleOfWater(prod.Sprite.toString(), new BigDecimal(350), 0.45),
                new BottleOfWater(prod.Fanta.toString(), new BigDecimal(320), 0.43),
                new BottleOfWater("Bon-Aqua", new BigDecimal(150), 0.5)));
        vmBottle.initProduct(bottleList);
        System.out.println(vmBottle.getProduct("Cola"));

        System.out.println("--------- ГОРЯЧИЕ НАПИТКИ ---------");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", new BigDecimal(200), 0.3, 80),
                new HotDrinks("Tea", new BigDecimal(100), 0.4, 70),
                new HotDrinks("Milk", new BigDecimal(300), 1.0, 65)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Tea"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(250)));
        System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(72));
    }

    /**
     * Перечисления для названий продуктов (сделал просто так, для понимания)
     */
    enum prod {
        Cola,
        Sprite,
        Fanta,
    }
}