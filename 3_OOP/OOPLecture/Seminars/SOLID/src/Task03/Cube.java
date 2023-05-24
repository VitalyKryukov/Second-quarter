package Task03;

public class Cube implements iShape, iShape3D {
    /**
     * @param edge - грань
     */
    private int edge;
    /**
     * Конструктор
     * @param edge - грань
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}