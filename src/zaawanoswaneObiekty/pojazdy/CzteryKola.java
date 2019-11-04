package zaawanoswaneObiekty.pojazdy;

public class CzteryKola extends Mechaniczne {
    String naped;

    public CzteryKola(String nazwa, int masa, int vMax, String naped) {
        super(nazwa, masa, vMax);
        this.naped = naped;
    }

    @Override
    public String toString() {
        return "czteryKola{" +
                "naped='" + naped + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", masa=" + masa +
                ", vMax=" + vMax +
                '}';
    }
}
