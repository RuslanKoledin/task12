package Task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    char symbolForSquare = scanner.next().charAt(0);
    Square square = new Square(symbolForSquare);
    square.draw();

    Scanner scanner1 = new Scanner(System.in);
    char symbolForTriangle = scanner1.next().charAt(0);
    Triangle triangle = new Triangle(symbolForTriangle);
    triangle.draw();

        triangle.draw2();
        /*Scanner scanner3 = new Scanner(System.in);
        char symbolForTrangle2 = scanner.next().charAt(0);
        Triangle2 triangle2 = new Triangle2(symbolForTrangle2);
        triangle2.draw();*/


/*        Circle circle = new Circle(3.4,23.3);
        circle.pCircle();*/




    }


        /*Lepeshka lepeshka = new Lepeshka(30, 200, "PIXA", 20);
        Lavash lavash = new Lavash(10, 100, "PIXA", 30);
        Baget baget = new Baget(80, 150, "RIXA", 20, 10);

        System.out.println(lepeshka);
        System.out.println(lavash);
        System.out.println(baget);
*/
//вызов метода

        /*lepeshka.applyPatterns();
        lepeshka.Bake();

        lavash.wrapUp();
        lavash.bake();

        baget.pack();*/

        /*public static vois pCicle2(){*/

    }
