package petle;


import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int n= scanner.nextInt();
        //wieza
        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //choinka

        for (int i = 1; i <n+1 ; i++) {
            //StringBuilder temp = new StringBuilder();
            for (int j = 0; j < n-i ; j++) {
                System.out.print(" ");
                //temp.append(" ");
            }
            for (int j = 0; j < 2*i -1 ; j++) {
                System.out.print("*");
                //temp.append("*");
            }
            System.out.println();
        }
    }
}
