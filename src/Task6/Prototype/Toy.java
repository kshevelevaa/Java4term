package Task6.Prototype;

interface Copyable{
    Object clone();
}
public class Toy implements Copyable {
    public Toy(){};

    private String name="some kind of toy";
    private int height=22;
    private int price=100;

    //@Override
//    public String toString() {
//        return "Toy{" +
//                "name='" + name + '\'' +
//                ", height=" + height +
//                ", price=" + price +
//                '}';
//    }

    public Toy(String name, int height, int price ){
        this.height=height;
        this.name=name;
        this.price=price;
    }


    public Object clone() {
        return new Toy(name,height,price);
    }
}
