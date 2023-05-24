package Task05;

public class Car {
    /**
     * @param engine - двигатель
     */
    private iEngine engine;
    /**
     * Конструктор
     * @param engine
     */
    public Car(iEngine engine) {
        this.engine = engine;
    }
    /**
     * Запуск двигателя
     */
    public void start() {
        this.engine.start();
    }
}