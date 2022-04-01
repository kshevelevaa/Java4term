package Task8.Visitor;

interface Visitor {
    void speakCat();
    void speakDog();
}
class ConcreteVisitor implements Visitor{

    @Override
    public void speakCat() {
        System.out.println("meows");
    }

    @Override
    public void speakDog() {
        System.out.println("barks");
    }
}
