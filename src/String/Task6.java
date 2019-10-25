package String;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj text");
        String name=scanner.next();
        System.out.println(name.contains("kot"));
    }
}
