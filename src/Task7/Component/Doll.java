package Task7.Component;

public class Doll implements Component{
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void remove() {
    }

    @Override
    public void getChild() {
    }

    public Doll() {
        super();
    }

    @Override
    public void printName() {
        System.out.println("this is a doll");
    }

    @Override
    public void add(Component t) {
    }
}
