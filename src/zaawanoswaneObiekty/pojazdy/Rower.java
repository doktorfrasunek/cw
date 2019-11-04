package zaawanoswaneObiekty.pojazdy;

public class Rower extends Mechaniczne {
    int przerzutki;

    public Rower(String nazwa, int masa, int vMax, int przerzutki) {
        super(nazwa, masa, vMax);
        this.przerzutki = przerzutki;
    }

    @Override
    public String toString() {
        return "Rower{" +
                "przerzutki=" + przerzutki +
                ", nazwa='" + nazwa + '\'' +
                ", masa=" + masa +
                ", vMax=" + vMax +
                '}';
    }
}
