package Task10;

public class Square extends Shape{

    public Square(char synbol) {
        super(synbol);
    }

    @Override
    void draw() {
        for (int i = 0; i < 5; i++) {
            System.out.print(this.getSymbol() + "  "); }//верхняя часть
        System.out.println();

        for (int j = 0; j < 3; j++) {
            System.out.print(this.getSymbol());
            for (int i = 0; i < 11; i++) {
                System.out.print(" "); }
            System.out.print(this.getSymbol());
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(this.getSymbol() + "  "); }
        System.out.println();
    }


}



