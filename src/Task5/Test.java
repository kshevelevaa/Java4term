package Task5;

public class Test {
    public static void main(String[] args){
        Singleton1 s1=Singleton1.getInstance();
        Singleton2 s2=Singleton2.getInstance();
        Singleton3 s3=Singleton3.INSTANCE;
        s3.printName();


    }
}
