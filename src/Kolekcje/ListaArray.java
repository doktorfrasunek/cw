package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class ListaArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(-10);
        System.out.println(list);
        list.remove(new Integer(2));
        System.out.println(list);
    }
}
