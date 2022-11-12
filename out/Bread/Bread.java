package Task10;

public class Bread {
    int price;
    int weight;
    String maker;

    public Bread(int price, int weight, String maker) {
        this.price = price;
        this.weight = weight;
        this.maker = maker;
    }


    public Bread(){

    }

    void bake(){
        System.out.println("Bake");
    }

    void pack(){
        System.out.println("Pack");
    }



    @Override
    public String toString() {
        return "Bread{" +
                "price=" + price +
                ", weight=" + weight +
                ", maker='" + maker + '\'' +
                '}';
    }
}
