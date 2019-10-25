package String;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String name=scanner.next();
        System.out.println(name.charAt(0)=='A');
    }
}
