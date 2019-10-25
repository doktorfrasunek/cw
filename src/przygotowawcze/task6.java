package przygotowawcze;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        System.out.println((double)firstNumber/secondNumber);
    }
}
