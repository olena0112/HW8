package hw.Shapes;

public class Oval implements Shape {
    private Point point;
    private int d1;
    private int d2;

    public Oval(Point point, int d1, int d2) {
        this.point = point;
        this.d1 = d1;
        this.d2 = d2;
    }

    private String name="Oval";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Oval{" +
                "point=" + point.x+";"+point.y +
                ", d1=" + d1 +
                ", d2=" + d2 +
                ", name='" + name + '\'' +
                '}';
    }
}
