package Task6.Builder;

public class Test {
    public static void main(String[] args){
        Toy t1=new Toy();
        System.out.println(t1);
        Toy t2=new Toy.Builder().withName("Lego").withPrice(250).build();
        t1=t2;
        System.out.println(t1);


    }
}
