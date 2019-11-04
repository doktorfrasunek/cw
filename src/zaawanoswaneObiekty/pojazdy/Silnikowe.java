package zaawanoswaneObiekty.pojazdy;

public class Silnikowe extends Pojazd{
    int mocSilnika;

    public Silnikowe(String nazwa, int masa, int vMax, int mocSilnika) {
        super(nazwa, masa, vMax);
        this.mocSilnika = mocSilnika;
    }

    @Override
    public String toString() {
        return "Silnikowe{" +
                "mocSilnika=" + mocSilnika +
                ", nazwa='" + nazwa + '\'' +
                ", masa=" + masa +
                ", vMax=" + vMax +
                '}';
    }
}
