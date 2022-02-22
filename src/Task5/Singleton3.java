package Task5;

public class Singleton3 {
    private Singleton3(){
        System.out.println("The third");
    }
    public static final Singleton3 INSTANCE=new Singleton3();
    public void printName(){
        System.out.println("33333");
    }



}
