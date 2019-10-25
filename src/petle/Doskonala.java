package petle;

public class Doskonala {


    public static void main(String[] args) {
        int counter = 0;
        int n = 1;
        while (counter < 4) {
            int suma = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    suma += i;
                }
            }
            if (suma==n) {
                System.out.println(n);
                counter++;
            }
            n++;
        }
    }
}