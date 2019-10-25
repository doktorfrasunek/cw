package petle;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int krok;
        if (n>1){
              krok= 1;
         }
        else  krok = -1;
        int suma = 0;
        int i = 1;
        while (i!=n+krok)
        {
            suma += i;
            i += krok;
        }

        System.out.println(suma);
        suma = 0;
        for (int j = 1; j !=n+krok ; j+=krok) {
            suma += j;
        }
        System.out.println(suma);
    }

}
