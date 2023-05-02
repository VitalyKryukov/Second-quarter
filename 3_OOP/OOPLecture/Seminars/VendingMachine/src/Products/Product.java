package Products;

/**
 * Базовый класс продукта
 */
public class Product {
    /**
     * @param name наименование продукта
     */
    private String name;
    /**
     * @param price наименование продукта
     */
    private Double price;

    /**
     * Конструктор с 2-мя параметрами
     * @param name имя продукта
     * @param price цена продукта
     * 
     */
    public Product(String name, Double price){
        // if(name == ""){
        //     throw new IllegalStateException(String.format("Продукт не имеет названия!", name));
        // }
        // else{
        this(name);
        this.price = price;
        // }
    }
    /**
     * Конструктор с 1-м параметром
     * @param name имя продукта
     */
    public Product(String name){
        this.name = name;
    }
    /**
     * Полуяаем имя продукта
     * @return имя продукта
     */
    public String getName(){
        return name;
    }
    /**
     * Вносим имя продукта
     * @return имя продукта
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Получаем цену продукта
     * @return цена продукта
     */
    public Double getPrice(){
        return price;
    }
    /**
     * Устанавливаем цену продукта
     * @param value цена продукта
     */
    public void setPrice(Double value){
        if (value <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно!", name));
        }
        else{
        this.price = value;
        }
    }
    /**
     * Переопределение метода toString
     */
    @Override
    public String toString(){
        return "Product{" +
        "name='" + name + '\'' +
        ", cost=" + price +
        '}';
    }
   

}
  