package Kolekcje;

import java.util.HashMap;
import java.util.Map;

public class Task16 {
    public static Map<String, String> pairs(String[] strings){
        Map<String,String> map = new HashMap<>();
        for (String s:
             strings) {
            map.put(""+s.charAt(0),
                    ""+ s.charAt(s.length()-1) );

        }
        return map;
    }

    public static void main(String[] args) {
        String[] elements = new String[]{
                "sól",
                "pieprz",
                "gazeta"
        };
        System.out.println(pairs(elements));
    }
}
