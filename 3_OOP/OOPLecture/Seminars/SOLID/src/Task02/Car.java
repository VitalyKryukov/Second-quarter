package Task02;

public class Car extends Vehicle {
    /**
     * Конструктор
     * @param maxSpeed - максимальная скорость 
     * @param type - тип
     */
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }    
    
    @Override
    public double calculateAllowedSpeed() {
        return super.maxSpeed * 0.8;
    }
}