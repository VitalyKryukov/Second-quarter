package Task03;

public class Circle implements iShape {
    /**
     * @param radius - радиус
     */
    private double radius;
    /**
     * Конструктор 
     * @param radius - радиус
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}