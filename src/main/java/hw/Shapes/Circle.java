package hw.Shapes;

public class Circle implements Shape {
    private Point point;
    private int radius;
    private  String name="Circle";

    public Circle(Point point,int radius) {
        this.point = point;
        this.radius=radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point.x+";"+point.y +
                ", radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
