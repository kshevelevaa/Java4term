package Task6.AbstractFactory;

public class ToysFactory implements AbstractToysFactory{
    @Override
    public Ball createBall() {
        return new Ball();
    }

    @Override
    public Doll createDoll() {
        return new Doll();
    }

    @Override
    public Lego createLego() {
        return new Lego();
    }
}
