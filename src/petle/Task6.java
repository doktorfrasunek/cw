package petle;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();
        int liczba= random.nextInt(1001);
        int odpowiedz=1002;
        int min=0;
        int max=1000;
        while (liczba!=odpowiedz){
            System.out.println("Podaj liczbe pomiedzy "+ min + " a " + max);
            odpowiedz=scanner.nextInt();
            if (odpowiedz<liczba){
                System.out.println("Za mało");
                min= min > odpowiedz+1 ? min : odpowiedz+1;
            }
            else if(odpowiedz>liczba){
                System.out.println("Za duzo");
                max= max < odpowiedz-1 ? max : odpowiedz-1;
            }
            else {
                System.out.println("W sam raz");
            }
        }
    }
}
