package warunkowe;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Napisz wyraz");
        Scanner scanner = new Scanner(System.in);
        String string=scanner.next();
        if (string.equals("Akademia")){
            System.out.println("to Akademia");
        }
        else{
            System.out.println("to nie jest Akademia");
        }

    }
}
