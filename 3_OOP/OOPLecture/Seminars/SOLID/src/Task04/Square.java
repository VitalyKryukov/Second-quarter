package Task04;

public class Square extends RightAngleShape {
    /**
     * @param length - длинна
     */
    private int length;
    /**
     * Конструктор
     * @param length - длинна
     */
    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return this.length * this.length;
    }
}