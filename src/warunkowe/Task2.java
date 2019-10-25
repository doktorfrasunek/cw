package warunkowe;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        if (number%3==0){
            System.out.println("podzielna przez 3");
        }
        else{
            System.out.println("niepodzielna przez 3");
        }

    }
}
