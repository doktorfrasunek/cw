package Battle;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    Random random;
    List<Card> cards = new ArrayList<Card>();

    public Deck(int size, int seed) {
        random= new Random(seed);
        for (int i = 0; i <size ; i++) {
            cards.add(new Card(random));
        }
    }


    public void show() {
        for (Card card: cards
             ) {
            System.out.print(card+ "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Deck deck1= new Deck(3,10);
        Deck deck2= new Deck(3,10);
        deck1.show();
        deck2.show();
    }
}
