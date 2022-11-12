package Task10;

public class Triangle extends Shape {

    public Triangle(char symbol) {
        super(symbol);
    }
        @Override
        void draw()
        {
            System.out.print("      " + this.getSymbol() + "\n");
            System.out.print("    " + this.getSymbol());

            for (int i = 0; i < 3; i++) {
                System.out.print(" ");
            }
            System.out.print(this.getSymbol() + "\n");
            System.out.print("   " + this.getSymbol());

            for (int i = 0; i < 5; i++) {
                System.out.print(" ");
            }
            System.out.print(this.getSymbol() + "\n");
            System.out.print("  " + this.getSymbol());

            for (int i = 0; i < 7; i++) {
                System.out.print(" "); }
            System.out.print(this.getSymbol() + "\n");
            System.out.print(" " + this.getSymbol());

            for (int i = 0; i < 9; i++) {
                System.out.print(" "); }
            System.out.print(this.getSymbol() + "\n");

            for (int i = 0; i < 5; i++) {
                System.out.print(this.getSymbol() + "  "); }
        }

        void draw2(){
            System.out.println("");
                System.out.println("    " + "*");
                System.out.println("  " + "*" + "   " + "*");
                System.out.println(" " + "*" + "     " + "*");
                System.out.println("*" + "       " + "*");
            for (int i = 0; i < 4; i++) {
                System.out.print("*" + "  "); }

            System.out.println();
            System.out.println();



    }

}

