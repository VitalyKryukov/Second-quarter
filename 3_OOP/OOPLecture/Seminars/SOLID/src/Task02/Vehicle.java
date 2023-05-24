package Task02;

public class Vehicle {
    /**
     * @param maxSpeed - максимальная скорость
     */
    int maxSpeed;
    /**
     * @param type - тип
     */
    String type;
    /**
     * Конструктор
     * @param maxSpeed - максимальная скорость
     * @param type - тип
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    /**
     * Получить максимальную скорость
     * @return
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    /**
     * Получить тип
     * @return
     */
    public String getType() {
        return this.type;
    }
    /**
     * Метод расчета допустимой скорости
     * @return
     */
    public double calculateAllowedSpeed() {
        return maxSpeed;
    }
}