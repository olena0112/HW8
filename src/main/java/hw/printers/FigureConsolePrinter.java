package hw.printers;

import hw.Shapes.Shape;

public class FigureConsolePrinter implements FigurePrinter {
    @Override
    public void print(Shape sh) {
        System.out.println(sh);
    }
}
