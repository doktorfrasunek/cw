package Kolekcje;

import java.util.HashMap;
import java.util.Map;

public class Task14 {
    public Map<String, Integer> wordCount(String[] elements) {
        Map<String, Integer> map = new HashMap();
        for (String element :
                elements
        ) {
            if (map.containsKey(element)) {
                map.replace(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        return map;
    }

}
