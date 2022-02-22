package Task6.Factory;

public class ToysFactory {
    public Ball createBall(){
        return new Ball();
    };
    public Doll createDoll(){
        return new Doll();
    }
    public Lego createLego(){
        return new Lego();
    }
}
