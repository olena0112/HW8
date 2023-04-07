package hw.Shapes;

public class Triangle implements Shape{
    private Point point;
    private int a;
    private int b;
    private int c;
    private String name="Triangle";

    public Triangle(Point point, int a, int b, int c) {
        this.point = point;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point=" + point.x+";"+point.y +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }
}
