package Task6.Prototype;

public class Test {
    public static void main(String[] args){
        Toy t1=new Toy("Lego",15,220);
        System.out.println(t1);
        Toy clone= (Toy)t1.clone();
        System.out.println(clone);

    }
}
