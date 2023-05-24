package Task02;

public class Bus extends Vehicle {
    /**
     * Конструктор
     * @param maxSpeed - максимальная скорость 
     * @param type - тип
     */
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }    
    
    @Override
    public double calculateAllowedSpeed() {
        return super.maxSpeed * 0.6;
    }
}
