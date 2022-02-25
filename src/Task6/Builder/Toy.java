package Task6.Builder;

public class Toy {
    private String name="some kind of toy";
    private int height=22;
    private int price=100;


    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", price=" + price +
                '}';
    }
    public static class Builder {
        private Toy buildingToy;

        public Builder (){
            this.buildingToy=new Toy();
        }
        public Builder withName(String name){
            buildingToy.name=name;
            return this;
        };
        public Builder withPrice(int price){
            buildingToy.price=price;
            return this;
        }
        public Toy build(){
            return buildingToy;
        }
    }
}
