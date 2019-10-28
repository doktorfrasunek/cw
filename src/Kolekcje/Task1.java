package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static List<Integer> getDividedByThree (List<Integer> numbers){
        List<Integer> result = new ArrayList<>();
        for (int i :
            numbers
             ) {
            if (i%3==0){
                result.add(i);
            }

        }
        return result;
    }
}
