package zaawanoswaneObiekty.pojazdy;

public class DwaKola extends Silnikowe {
    boolean wymagauprawnien;

    public DwaKola(String nazwa, int masa, int vMax, int mocSilnika, boolean wymagauprawnien) {
        super(nazwa, masa, vMax, mocSilnika);
        this.wymagauprawnien = wymagauprawnien;
    }

    @Override
    public String toString() {
        return "DwaKola{" +
                "wymagauprawnien=" + wymagauprawnien +
                ", mocSilnika=" + mocSilnika +
                ", nazwa='" + nazwa + '\'' +
                ", masa=" + masa +
                ", vMax=" + vMax +
                '}';
    }
}
