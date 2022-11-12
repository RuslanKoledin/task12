package Task10;

public class Circle {
    final double pi = 3.14;
    double radius;
    double pCirlce;

    public Circle(double radius, double pCirlce) {
        this.radius = radius;
        this.pCirlce = pCirlce;
    }


    void pCircle(){
        pCirlce = pi * radius * radius;
        System.out.println(pCirlce);
    }
   /* static void pCircle2(){

        pCircle2 = 2 * pi * radius;
    }*/


}
