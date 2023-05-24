package Task04;

public class Rectangle extends RightAngleShape {
    /**
     * @param width - ширина
     */
    private int width;
    /**
     * @param height - высота
     */
    private int height;    
    /**
     * Конструктор
     * @param width - ширина
     * @param height - высота
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
}