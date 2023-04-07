package hw.Shapes;

public class Square implements Shape{
    private Point point;
    private int a;
    private String name="Square";
    public Square(Point point, int a) {
        this.point = point;
        this.a = a;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Square{" +
                "point=" + point.x+";"+point.y+", a="+a +
                ", S=" + a*a  +
                ", name='" + name + '\'' +
                '}';
    }
}
