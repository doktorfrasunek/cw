package warunkowe;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        if (number>5){
            System.out.println("wieksza");
        }
        else{
            System.out.println("mniejsze lub równa");
        }

    }
}
