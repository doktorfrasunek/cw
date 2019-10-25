package warunkowe;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Napisz imie");
        Scanner scanner = new Scanner(System.in);
        String string=scanner.next();
        if (string.charAt(string.length()-1)=='a'){
                if (!string.equals("Zawisza") && !string.equals("Kosma") )
            System.out.println("żeńskie");
                else
                    System.out.println("męskie");
        }
        else{
            System.out.println("męskie");
        }

    }
}
