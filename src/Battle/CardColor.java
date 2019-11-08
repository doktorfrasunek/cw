package Battle;

public enum CardColor {
    trefl(1),
    karo(2),
    kier(3),
    pik(4);
    int power;
    CardColor(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
