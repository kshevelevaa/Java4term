package Task8.Template;

public class Doll extends Toy {

    @Override
    void buying() {
        System.out.println("You buy a Doll");
    }

    @Override
    void playingWithFriend() {
        System.out.println("You sewed a dress for your Doll with your friend");
    }

    @Override
    void playingAlone() {
        System.out.println("You play with your Doll");
    }
}
