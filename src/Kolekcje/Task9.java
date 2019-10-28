package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    static int getMax(List<Integer> list ){
        int max= list.get(0);
        for (int i:
             list) {
            max = max>i ? max:i;
        }
        //return  list.stream().max(Integer::compareTo).get();
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(getMax(list));
    }
}
