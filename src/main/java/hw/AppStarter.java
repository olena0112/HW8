package hw;

import hw.Shapes.*;
import hw.printers.FigureArrayPrinter;
import hw.printers.FigureConsolePrinter;
import hw.printers.FigurePrinter;
import java.util.Scanner;

public class AppStarter {
    public static void main(String[] args) {
        doLogic();
    }
    public static void doLogic(){
        Shape[] shapes=createFigures();
        printFigures(shapes,new FigureConsolePrinter() );
    }
    public static Shape[] createFigures(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть кількість фігур, які будуть створені: ");
        int n = in.nextInt();
        Shape[] ca = new Shape[n];
        for(int i=0;i<ca.length;i++) {
            System.out.println("Введіть наступне число для створення відповідної фігури:\n1 - Коло\n2 - Овал\n3 - Квадрат\n4 - Трикутник\n5 - Зірка");
            int number = in.nextInt();
            if (number == 1) {
                System.out.print("Введіть координати центру кола(x,y) та радіус(r):\nx=");
                int x = in.nextInt();
                System.out.print("y=");
                int y = in.nextInt();
                System.out.print("r=");
                int r = in.nextInt();
                ca[i]=new Circle(new Point(x,y),r );
            }
            if (number == 2) {
                System.out.print("Введіть координати центру овалу(x,y) та d1,d2:\nx=");
                int x = in.nextInt();
                System.out.print("y=");
                int y = in.nextInt();
                System.out.print("d1=");
                int d1 = in.nextInt();
                System.out.print("d2=");
                int d2 = in.nextInt();
                ca[i]=new Oval(new Point(x,y),d1,d2 );
            }
            if (number == 3) {
                System.out.print("Введіть координати центру квадрата(x,y) та сторону(а):\nx=");
                int x = in.nextInt();
                System.out.print("y=");
                int y = in.nextInt();
                System.out.print("а=");
                int a = in.nextInt();
                ca[i]=new Square(new Point(x,y),a );
            }
            if (number == 4) {
                System.out.print("Введіть координати центру трикутника(x,y) та сторони(a,b,c):\nx=");
                int x = in.nextInt();
                System.out.print("y=");
                int y = in.nextInt();
                System.out.print("a=");
                int a = in.nextInt();
                System.out.print("b=");
                int b = in.nextInt();
                System.out.print("c=");
                int c = in.nextInt();
                ca[i]=new Triangle(new Point(x,y),a,b,c );
            }
            if (number == 5) {
                System.out.print("Введіть координати центру зірки(x,y) та кількість вершин(k):\nx=");
                int x = in.nextInt();
                System.out.print("y=");
                int y = in.nextInt();
                System.out.print("k=");
                int k = in.nextInt();
                ca[i]=new Star(new Point(x,y),k );
            }
            if(number!=1&&number!=2&&number!=3&&number!=4&&number!=5){
                System.out.print("Введіть коректне число\n");
                i--;
            }
        }
        return ca;
    }
    public static void printFigures(Shape[] sa, FigurePrinter fp){
        new FigureArrayPrinter().printFigureUsingFigurePrinter(sa,fp);
    }
}
