package Kolekcje;

import java.util.LinkedList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int temp= list.get(0);
        list.set(0,list.get(2));
        list.set(2,temp);
        System.out.println(list);
    }
}
