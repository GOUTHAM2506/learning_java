package song;

import movie.Leo;
import newmovie.suriya.Karuppu;

public class Ready {
    public String singer = "Anirudh";

    public static void main(String[] args) {
        Ready r = new Ready();
        System.out.println("I am singer " + r.singer + " who sang Naa Ready Song.");
        Leo l2 = new Leo();
        System.out.println("I am actor " + l2.actor);
        Karuppu k2 = new Karuppu();
        System.out.println("I am The One " + k2.actor);
    }
}
