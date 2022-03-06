package Task7.Facade;

public class Doll implements Toy{


    @Override
    public void buy() {
        System.out.println("You have a doll");
    }

    @Override
    public void using() {
        System.out.println("You play with doll");
    }
}
