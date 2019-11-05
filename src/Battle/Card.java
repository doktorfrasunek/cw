package Battle;

import java.util.Random;

public class Card {
    int number;
    CardColor color;
    boolean rarity;

    public Card(Random random) {
        this.number = random.nextInt(10)+1;
        this.color = CardColor.values()[random.nextInt(3)];
        this.rarity = random.nextBoolean();
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", color=" + color +
                ", rarity=" + rarity +
                '}';
    }
}
