package Task7.Facade;

public class Ball implements Toy{


    @Override
    public void buy() {
        System.out.println("You have a ball");
    }

    @Override
    public void using() {
        System.out.println("You threw a ball");
    }
}
