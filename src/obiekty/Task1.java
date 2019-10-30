package obiekty;

import java.math.BigDecimal;

 class Pracownik {
    String imie;
    String nazwisko;
    BigDecimal pensja;
    int wiek;

    public Pracownik(String imie, String nazwisko, BigDecimal pensja, int wiek) throws IllegalArgumentException {
        setImie(imie);
        setNazwisko(nazwisko);
        this.pensja = pensja;
        this.wiek = wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setPensja(BigDecimal pensja) {
        this.pensja = pensja;
    }

    public void setImie(String imie) throws IllegalArgumentException{
        if (isValidName(imie)) {
            this.imie = imie;
            System.out.println("wawm");
        }
        else throw new IllegalArgumentException("Imie musi byc dłuższe niż 4 znaki i zaczynać się od wielkiej litery");
    }

    public void setNazwisko(String nazwisko) throws IllegalArgumentException{
        if (isValidName(nazwisko)) {
            this.nazwisko = nazwisko;
        }
        else throw new IllegalArgumentException("Imie musi byc dłuższe niż 4 znaki i zaczynać się od wielkiej litery");
    }

    public BigDecimal pensjaRoczna(){
        return pensja.multiply(new BigDecimal("12"));
    }

    private boolean isValidName(String s){
        System.out.println(Character.isUpperCase(s.charAt(0)));
        System.out.println(s.length() > 4);
        return s.length() > 4 && Character.isUpperCase(s.charAt(0));
    }

 }
public class Task1{
    public static void main(String[] args) {
        try {
            Pracownik pracownik1= new Pracownik("Jerzy","Kowaliski", new BigDecimal("1230.0"), 33);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Pracownik pracownik2= new Pracownik("jerzy","Kowaliski", new BigDecimal("1230.0"), 33);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }
}