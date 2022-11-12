package Task10;

public class Lepeshka extends Bread{
    int radius;

    public Lepeshka(int price, int weight, String maker, int radius) {
        super(price, weight, maker);
        this.radius = radius;
    }
    void Bake(){
        System.out.println("Bake!");
    }

    void applyPatterns(){
        System.out.println("нанесенные узоры!");
    }

    @Override
    public String toString() {
        return "Lepeshka{" +
                "radius=" + radius +
                ", price=" + price +
                ", weight=" + weight +
                ", maker='" + maker + '\'' +
                '}';
    }
}
