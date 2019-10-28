package Kolekcje;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Map<Integer,Integer> map= new TreeMap<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj liczbę");
            int k = scanner.nextInt();
            if (map.containsKey(k)){
                map.replace(k,map.get(k)+1);
            }
            else {
                map.put(k,1);
            }
        }

        for (Map.Entry<Integer, Integer> i:
            map.entrySet()
             ) {
            System.out.print(i.getKey() + " wystepuje " + i.getValue()+ " raz");
            if (i.getValue()>1){
                System.out.println("y");
            }
            else System.out.println();
            
        }
    }
}
