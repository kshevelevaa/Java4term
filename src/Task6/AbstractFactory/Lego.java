package Task6.AbstractFactory;

public class Lego implements Toys{
    Lego(){
        System.out.println("You have a lego");
    }
    public void createSmt(){
        System.out.println("You have built a lego house");
    }
    @Override
    public void printColor() {
        System.out.println("Your lego is colorful");
    }
}
