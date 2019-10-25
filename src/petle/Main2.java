package petle;

import java.math.BigInteger;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę całkowitą");
        Scanner scanner = new Scanner(System.in);
        BigInteger n = new BigInteger(scanner.next());
        System.out.println(
                (n.multiply(n.add(BigInteger.ONE))).divide(BigInteger.valueOf(2))
        );
    }
}



