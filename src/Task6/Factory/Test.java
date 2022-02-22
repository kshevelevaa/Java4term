package Task6.Factory;

public class Test {
    public static void main(String[] args){
        ToysFactory toys=new ToysFactory();
        Ball ball=toys.createBall();
        Doll doll=toys.createDoll();
        Lego lego=toys.createLego();
        lego.createSmt();
    }

}
