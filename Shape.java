package Task10;

public abstract class Shape {
    private char symbol;

    abstract void draw();

    public Shape(char synbol) {
        this.symbol = synbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
