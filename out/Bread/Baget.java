package Task10;

public class Baget extends Bread{

    int length;
    int cutCount;

    public Baget(int price, int weight, String maker, int length, int peace) {
        super(price, weight, maker);
        this.length = length;
        this.cutCount = peace;
    }

    void peaces(int cutCount){
        System.out.println("на сколько частей рубцевать ?");

    }

    void setCutCount(){
        this.cutCount = cutCount;
    }

    void pack(){
        System.out.println("упакован в экологический пакет !");
    }

    @Override
    public String toString() {
        return "Baget{" +
                "length=" + length +
                ", peace=" + cutCount +
                ", price=" + price +
                ", weight=" + weight +
                ", maker='" + maker + '\'' +
                '}';
    }
}
