package enumy;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Sklep {
    static Map<Owoce, Integer> zamowienieOwoce = new TreeMap<>();
    static Map<Warzywa, Integer> zamowienieWarzywa = new TreeMap<>();
    static ArrayList<Owoce> owoce = new ArrayList<>();
    static ArrayList<Warzywa> warzywa = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        dodajOwoce();
        dodajWarzywa();

        while (zamowienieOwoce.size() + zamowienieWarzywa.size() < 5) {
            wyswietlProdukty();
            System.out.println("Podaj numer produktu");
            int numer = scanner.nextInt();
            if (numer < owoce.size()) sprzedajOwoc(numer);
            else sprzedajWarzywo(numer - warzywa.size());
        }
        System.out.println(zamowienieOwoce);
        System.out.println(zamowienieWarzywa);
        scanner.close();
    }

    static void sprzedajOwoc(int index) {
        Owoce temp = owoce.get(index);
        int ilosc = temp.ilosc;

        if (ilosc > 0) {
            if (temp.nasztuki)
                System.out.println(temp + " cena: " + temp.cena + "/szt" + " na stanie jest " + ilosc + " szt.");
            else
                System.out.println(temp + "cena: " + temp.cena + "/kg" + " na stanie jest " + ilosc + " kg.");
            System.out.println("Ile chcesz kupic? 0-rezygnacja");
            int zakup = scanner.nextInt();
            if (zakup > 0) {
                if (zakup > ilosc) {
                    System.out.println("Na stanie jest tylko " + ilosc + "i tyle dodajemy do koszyka");
                    zakup = ilosc;
                }
                if (zamowienieOwoce.containsKey(temp)) {
                    zamowienieOwoce.put(temp, zamowienieOwoce.get(temp) + zakup);
                } else zamowienieOwoce.put(temp, zakup);
                temp.ilosc -= zakup;
            }

        } else {
            System.out.println("Produkt niedostępny");
        }
    }

    static void sprzedajWarzywo(int index) {
        Warzywa temp = warzywa.get(index);
        int ilosc = temp.ilosc;

        if (ilosc > 0) {
            if (temp.nasztuki)
                System.out.println(temp + " cena: " + temp.cena + "/szt" + " na stanie jest " + ilosc + " szt.");
            else
                System.out.println(temp + "cena: " + temp.cena + "/kg" + " na stanie jest " + ilosc + " kg.");
            System.out.println("Ile chcesz kupic? 0-rezygnacja");
            int zakup = scanner.nextInt();
            if (zakup > 0) {
                if (zakup > ilosc) {
                    System.out.println("Na stanie jest tylko " + ilosc + "i tyle dodajemy do koszyka");
                    zakup = ilosc;
                }
                if (zamowienieWarzywa.containsKey(temp)) {
                    zamowienieWarzywa.put(temp, zamowienieWarzywa.get(temp) + zakup);
                } else zamowienieWarzywa.put(temp, zakup);

                temp.ilosc -= zakup;
            }

        } else {
            System.out.println("Produkt niedostępny");
        }
    }

    static void dodajOwoce() {
        for (Owoce produkt :
                Owoce.values()) {
            owoce.add(produkt);
        }
    }

    static void dodajWarzywa() {
        for (Warzywa produkt :
                Warzywa.values()) {
            warzywa.add(produkt);
        }
    }

    static void wyswietlProdukty() {
        for (int i = 0; i < owoce.size(); i++) {
            Owoce temp = owoce.get(i);
            int ilosc = temp.ilosc;

            if (ilosc > 0) {
                System.out.println(i + ". " + temp);

            }

        }
        for (int i = 0; i < warzywa.size(); i++) {
            Warzywa temp = warzywa.get(i);
            int ilosc = temp.ilosc;

            if (ilosc > 0) {
                System.out.println((i + owoce.size()) + ". " + temp);

            }

        }
    }


}

