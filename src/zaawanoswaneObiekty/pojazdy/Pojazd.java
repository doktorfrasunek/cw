package zaawanoswaneObiekty.pojazdy;

public class Pojazd {
    String nazwa;
    int masa;
    int vMax;

    public Pojazd(String nazwa, int masa, int vMax) {
        this.nazwa = nazwa;
        this.masa = masa;
        this.vMax = vMax;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "nazwa='" + nazwa + '\'' +
                ", masa=" + masa +
                ", vMax=" + vMax +
                '}';
    }
}
