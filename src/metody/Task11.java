package metody;

public class Task11 {
    public static void main(String[] args) {
        for (int i = 1; i < 30; i++) {
            System.out.println("Liczba  dzielnikow dla liczby " + i + " to " + liczbaDzielnikow(i) );
        }
        System.out.println(liczbaDzielnikow(7560));
    }
    public static int liczbaDzielnikow(int n){
        int licznik = 0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                licznik++;
            }
        }
        //
        return licznik;
    }
}
