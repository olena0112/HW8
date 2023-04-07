package hw.Shapes;

public class Star implements Shape{
    private Point point;
    private int k;

    public Star(Point point, int k) {
        this.point = point;
        this.k = k;
    }

    @Override
    public String toString() {
        return "Star{" +
                "point=" + point.x+";"+point.y +
                ", k=" + k +
                ", name='" + name + '\'' +
                '}';
    }

    private String name="Star";
    @Override
    public String getName() {
        return name;
    }
}
