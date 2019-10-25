package zbiory;

import java.util.*;

public class testingHashset {
    public static void main(String[] args) {
        Set<Integer> zbior = new LinkedHashSet<>();
        Random random=new Random();
        for (int i = 0; i <5 ; i++) {
            int k = random.nextInt(250);
            System.out.println(k);
            zbior.add(k);
        }
        System.out.println("***************************");
        Iterator<Integer> iterator=zbior.iterator();
        for (int i = 0; i <5 ; i++) {
            System.out.println(iterator.next());
        }
    }
}
