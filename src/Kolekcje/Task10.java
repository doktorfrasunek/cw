package Kolekcje;

import java.util.LinkedList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(2,8);
        System.out.println(list);
    }
}
