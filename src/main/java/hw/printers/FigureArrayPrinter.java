package hw.printers;

import hw.Shapes.Shape;

public class FigureArrayPrinter {
    public void printFigureUsingFigurePrinter(Shape[] sa, FigurePrinter fp){
        for(Shape s:sa){
            fp.print(s);
        }
    }
}
