package Task10;

public class Triangle2 extends Shape{
    public Triangle2(char synbol) {
        super(synbol);
    }

    @Override
    void draw() {
        for (int i = 0; i < 5; i++) {
            System.out.print(getSymbol() + "  ");
        }
        System.out.println("");
        for (int i = 0; i < 4; i++ ){
            System.out.print(getSymbol());
            for (int j = 0; j < 11; j++) {
                System.out.print(" "); }
            System.out.print(getSymbol());
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(getSymbol() + "  ");
        }
    }
}
