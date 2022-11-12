package Task10;

public class Lavash extends Bread{

    int thickness;

    public Lavash(int price, int weight, String maker, int thickness) {
        super(price, weight, maker);
        this.thickness = thickness;
    }

    public Lavash(int thickness) {
        this.thickness = thickness;
    }

    void wrapUp(){
        System.out.println("завернуть!");
    }

    void bake(){
        System.out.println("я лаваш , меня испекли");
    }

    @Override
    public String toString() {
        return "Lavash{" +
                "Толщина =" + thickness +
                ", price=" + price +
                ", weight=" + weight +
                ", maker='" + maker + '\'' +
                '}';
    }
}
