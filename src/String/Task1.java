package String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszy wyraz");
        Scanner scanner= new Scanner(System.in);
        String firstWord = scanner.next();
        System.out.println("Podaj drugi wyraz");
        String secondWord = scanner.next();
        System.out.println(secondWord+" "+ firstWord);
    }
}
