package obiekty;

import java.util.ArrayList;
import java.util.List;
class Laptop{
    int ram;
    public Laptop(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                '}';
    }
}

class Krzeslo{
    String color;

    public Krzeslo(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Krzeslo{" +
                "color='" + color + '\'' +
                '}';
    }
}

class Lawka{
    String color;

    public Lawka(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lawka{" +
                "color='" + color + '\'' +
                '}';
    }
}
class Sala{
    int wysokosc;
    int szerokosc;
    int dlugosc;
   List<Lawka> lawki = new ArrayList<>();
   List<Krzeslo> krzesla = new ArrayList<>();
   List<Laptop> laptopy = new ArrayList<>();

    public Sala(int wysokosc, int szerokosc, int dlugosc) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
    }
    void addLaptop(Laptop laptop){
       if (laptopy==null){
           laptopy = new ArrayList<>();
       }
        laptopy.add(laptop);
    }
    void addLawka(Lawka lawka){
        lawki.add(lawka);
    }

    void addKrzeslo(Krzeslo krzeslo){
        krzesla.add(krzeslo);
    }

    @Override
    public String toString() {
        return "Sala{" +
                "wysokosc=" + wysokosc +
                ", szerokosc=" + szerokosc +
                ", dlugosc=" + dlugosc +
                ", lawki=" + lawki +
                ", krzesla=" + krzesla +
                ", laptopy=" + laptopy +
                '}';
    }

    int obliczPowierzchnie(){
        return szerokosc*dlugosc;
    }

    int obliczObjetosc(){
        return obliczPowierzchnie()*wysokosc;
    }
}

public class Example {
    public static void main(String[] args) {
        Sala sala = new Sala(3,4,5);
        sala.addKrzeslo(new Krzeslo("czarne"));
        sala.addKrzeslo(new Krzeslo("czarne"));
        sala.addKrzeslo(new Krzeslo("czarne"));
        sala.addLawka(new Lawka("biala"));
        sala.addLawka(new Lawka("biala"));
        sala.addLaptop(new Laptop(8));
        sala.addLaptop(new Laptop(4));
        sala.addLaptop(new Laptop(4));
        System.out.println(sala);
    }

}
