package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(reverse(list));

    }
   public static List<Integer> reverse(List<Integer> list){
        List<Integer> result= new ArrayList<>();
        for (int i = list.size()-1; i >-1 ; i--) {
            result.add(list.get(i));
        }
        return result;
    }

}
