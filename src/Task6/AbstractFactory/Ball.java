package Task6.AbstractFactory;

public class Ball implements Toys{
    Ball(){
        System.out.println("You have a ball");
    };

    @Override
    public void printColor() {
        System.out.println("Your ball is red");
    }
}
