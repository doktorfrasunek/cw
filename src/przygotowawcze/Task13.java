package przygotowawcze;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double firstNumber = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double secondNumber = scanner.nextDouble();
        System.out.println("Podaj trzecią liczbę");
        double thirdNumber = scanner.nextDouble();
        System.out.println("Podaj czwartą liczbę");
        double fourthNumber = scanner.nextDouble();
        double result = (firstNumber+secondNumber+thirdNumber+fourthNumber)/4;
        System.out.format("%.3f%n", result);

    }
}
