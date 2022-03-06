package Task7.Component;

public class Test {
    public static void main(String[] args){
        Ball ball=new Ball();
        Doll doll=new Doll();
        Playing playing=new Playing();
        playing.add(ball);
        playing.add(doll);
        playing.printName();
        playing.remove();
        playing.add(doll);
        playing.add(ball);
        playing.printName();

    }
}
