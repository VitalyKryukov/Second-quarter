package VendingMachines;

import Products.Product;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private Integer volume;
    private List<Product> products;
    public List<String> workLog;

    public VendingMachine(int volume){
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }
    
    /**
     * Метод добавления продукта
     * @param prod продукт
     */
    public void addProduct(Product prod){
        products.add(prod);
    }
    
    /**
     * Лог операций
     * @param line лог
     */
    public void addSales(String line){
        workLog.add(line);
    }    

    public Product getProdByName(String name){
        for (Product product : products) {
            if(product.getName().contains(name)){
                return product;
            }
        }
        return null;
    }

    public List<Product> getProductAll(){
        return products;
    }

}
