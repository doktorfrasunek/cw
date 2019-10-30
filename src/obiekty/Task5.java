package obiekty;

import java.io.IOException;
import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("p - dodaj produkt lub zmien kategorie");
            System.out.println("k - dodaj kategorie");
            System.out.println("w- wyswietl kategorie");
            System.out.println("e- wyjdz");
            String command= scanner.nextLine();
            if (command.equals("e")) {
                scanner.close();
                break;
            }
            if (command.equals("k")){
                System.out.println("Podaj kategorie");
                String kategoria= scanner.nextLine();
                Kategoria.dodajKategorie(kategoria);

            }
            if (command.equals("w")) Kategoria.wypiszKategorie();
            if (command.equals("p")){
                System.out.println("Podaj produkt");
                String prod= scanner.nextLine();
                System.out.println("Do jakiej kategorii przypisac");
                String kategoria= scanner.nextLine();
                try {
                    Produkt.dodajProdukt(prod,kategoria);
                } catch (IOException e) {
                    System.out.println("Nie ma takiej kategorii");
                }

            }
        }

    }
}

class Kategoria{
    private static Map<String,Kategoria> kategorie = new TreeMap<>();

    static Kategoria dodajKategorie(String nazwa){
        if(kategorie.containsKey(nazwa))
            return kategorie.get(nazwa);
        else {
            Kategoria result= new Kategoria(nazwa);
            kategorie.put(nazwa,result);
            return result;
        }
    }
    static Kategoria pobierzKategorie(String nazwa) throws IOException {

        if (kategorie.containsKey(nazwa))
            return kategorie.get(nazwa);
        else throw new  IOException("Nie ma takiej kategorii: " + nazwa);
    }

     static void wypiszKategorie(){
        System.out.println(kategorie.values());
    }

    String nazwa;
    Set<Produkt> produktyWKategorii= new HashSet<>();

    void dodajProdukt(Produkt produkt){
        produktyWKategorii.add(produkt);

    }

      private Kategoria(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(nazwa + ": " + "\n");
        for (Produkt pr:
             produktyWKategorii) {
            result.append("\t");
            result.append( pr.Nazwa );
            result.append("\n");
        }
        return result.toString();

    }
}

class Produkt {
     static Produkt dodajProdukt(String nazwa, String kategoria) throws IOException {
        Produkt result;
        if(produkty.containsKey(nazwa)) {
            result = produkty.get(nazwa);
            Kategoria.pobierzKategorie(result.kategoria.nazwa)
                    .produktyWKategorii.remove(result);
            Kategoria.dodajKategorie(kategoria).produktyWKategorii.add(result);
            result.kategoria = Kategoria.pobierzKategorie(kategoria);
            return result;
        }
        else {
            result= new Produkt(nazwa, kategoria);
            produkty.put(nazwa,result);
            Kategoria.pobierzKategorie(kategoria).dodajProdukt(result);
            return result;
        }
    }
    private static Map<String,Produkt> produkty = new TreeMap<>();

    String Nazwa;
    private Kategoria kategoria;

    private Produkt(String nazwa, String kategoria) throws IOException {
        Nazwa = nazwa;
        this.kategoria = Kategoria.pobierzKategorie(kategoria);
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "Nazwa='" + Nazwa + '\'' +
                '}';
    }
}