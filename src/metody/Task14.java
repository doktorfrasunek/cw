package metody;

import java.util.ArrayList;
import java.util.List;

public class Task14 {
    public static void main(String[] args) {
        List<Integer>liczby = new ArrayList<>();
        int maxDzielnikow=0;
        for (int i = 2; i < 119 ; i++) {
            int liczbaDzielnikow= Task11.liczbaDzielnikow(i);
            if (liczbaDzielnikow==maxDzielnikow){
                liczby.add(i);
            }
            if (liczbaDzielnikow> maxDzielnikow){
                maxDzielnikow=liczbaDzielnikow;
                liczby.clear();
                liczby.add(i);
            }

            
        }
        System.out.println(liczby);
    }
}
