package Kolekcje;

import java.util.HashMap;
import java.util.Map;

public class Task15 {
    public static Map<String, String>  firstCha(String[] elements) {
        Map<String , String> map = new HashMap();
        for (String element :
                elements
        ) {

            String key = String.valueOf(element.charAt(0));
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + element);
            } else {
                map.put(key, element);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        String[] elements = new String[]{
                "sól",
                "pieprz",
                "sól",
                "samochód",
                "gazeta"
        };
        System.out.println(firstCha(elements));

    }
}
