package Task6.AbstractFactory;

public class Doll implements Toys{
    Doll(){
        System.out.println("You have a doll");
    }
    @Override
    public void printColor() {
        System.out.println("Your doll is in red yellow dress");
    }
}
