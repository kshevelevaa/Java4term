package Task5;

public class Singleton1 {
    private Singleton1(){
            System.out.println("The first");
    }
    private static Singleton1 instance;
    public static Singleton1 getInstance() {
        if (instance == null) {        //если объект еще не создан
            instance = new Singleton1();    //создать новый объект
        }
        return instance;        // вернуть ранее созданный объект
    }

}
