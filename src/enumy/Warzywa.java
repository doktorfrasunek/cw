package enumy;

public enum Warzywa {
    Ziemniak(3,10,false),
    Marchwew(2,5,false),
    Kalafior(5,10,true),
    Por(4,3,true),
    Seler(7,3,true);
    public int cena;
    public int ilosc;
    public boolean nasztuki;

    Warzywa(int cena, int ilosc, boolean nasztuki) {
        this.cena = cena;
        this.ilosc = ilosc;
        this.nasztuki = nasztuki;
    }

}
