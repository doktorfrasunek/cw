package Kolekcje;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Map<String , String> dictionary= new HashMap<>();
        dictionary.put("mama","mother");
        dictionary.put("tata","father");
        dictionary.put("syn", "son");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj slowo po polsku");
        String slowo= scanner.nextLine();
        if (dictionary.containsKey(slowo)){
            System.out.println("Angielskie slowo to "+ dictionary.get(slowo));
        }
        else {
            System.out.println("Nie znam tego slowa");
        }

    }
}
