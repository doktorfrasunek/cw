package obiekty;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

}

class Firma{
    List<Pracownik> pracownicy = new ArrayList<>();
    String nazwa;
    String siedziba;

    void dodajPracownika(Pracownik pracownik){
        pracownicy.add(pracownik);
    }
    int pobierzLiczbePracownikow(){
        return pracownicy.size();
    }

    public Firma(String nazwa, String siedziba) {
        this.nazwa = nazwa;
        this.siedziba = siedziba;
    }
}