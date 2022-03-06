package Task7.Facade;

public class Facade{
    private Doll doll;
    private Ball ball;
     public Facade(){
         doll=new Doll();
         ball=new Ball();
     }

     public void buy(){
         doll.buy();
         ball.buy();
     }
     public void using(){
         doll.using();
         ball.using();
     }
}
