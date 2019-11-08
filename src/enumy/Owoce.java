package enumy;

public enum Owoce  {
    Jabłka(3,10,false),
    Banany(2,5,false),
    Awokado(5,10,true),
    Mango(4,3,true),
    Pomelo(7,3,true);
    public int cena;
    public int ilosc;
    public boolean nasztuki;

    Owoce(int cena, int ilosc, boolean nasztuki) {
        this.cena = cena;
        this.ilosc = ilosc;
        this.nasztuki = nasztuki;
    }
}
