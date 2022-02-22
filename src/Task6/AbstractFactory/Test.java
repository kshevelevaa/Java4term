package Task6.AbstractFactory;


public class Test {
    public static void main(String[] args){
        ToysFactory toys=new ToysFactory();
        Ball ball=toys.createBall();
        Doll doll=toys.createDoll();
        Lego lego=toys.createLego();
        lego.createSmt();
        lego.printColor();
        ball.printColor();
        doll.printColor();
    }
}
