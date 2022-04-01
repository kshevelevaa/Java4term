package Task8.Visitor;

interface Animals {
    void doSpeak(Visitor v);
}
class Cat implements Animals{

    @Override
    public void doSpeak(Visitor v) {
        v.speakCat();
    }
}
class Dog implements Animals{

    @Override
    public void doSpeak(Visitor v) {
        v.speakDog();
    }
}
