package zaawanoswaneObiekty.pojazdy;

public class Mechaniczne extends Pojazd {

    public Mechaniczne(String nazwa, int masa, int vMax) {
        super(nazwa, masa, vMax);
    }

    @Override
    public String toString() {
        return "Mechaniczne{" +
                "nazwa='" + nazwa + '\'' +
                ", masa=" + masa +
                ", vMax=" + vMax +
                '}';
    }
}
