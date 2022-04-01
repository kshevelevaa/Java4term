package Task8.Template;

public abstract class Toy {
     abstract void buying();
     abstract void playingWithFriend();
     abstract void playingAlone();

     final void takingToy(){
         buying();
         playingAlone();
         playingWithFriend();
         System.out.println();
     };

}
