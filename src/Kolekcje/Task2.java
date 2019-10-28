package Kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static List<Integer> getSortedList (List<Integer> numbers){
        List<Integer>  result = new ArrayList<Integer>(numbers);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        System.out.println(getSortedList(list));


    }
}
