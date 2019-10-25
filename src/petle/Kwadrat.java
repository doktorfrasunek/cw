package petle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Kwadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int n= scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if ((j+i)%2==0){
                    System.out.print("x ");
                }
                else System.out.print("o ");
            }
            System.out.println();
        }
    }
}
