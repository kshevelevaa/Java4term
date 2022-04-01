package Task8.Template;

public class Lego extends Toy {

    @Override
    void buying() {
        System.out.println("You buy a Lego");
    }

    @Override
    void playingWithFriend() {
        System.out.println("You built a big city with your friend");
    }

    @Override
    void playingAlone() {
        System.out.println("You built a small house");
    }
}
