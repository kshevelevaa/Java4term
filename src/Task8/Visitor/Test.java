package Task8.Visitor;

public class Test {
    public static void main(String [] args){
    Animals d=new Dog();
    Animals c=new Cat();
    d.doSpeak (new ConcreteVisitor());
    c.doSpeak(new ConcreteVisitor());

}}
