package rekrutacyjneAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.stream.Collectors.toMap;

public class ReadAndCount2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i <10 ; i++) {
            String line=scanner.nextLine();
            if (map.containsKey(line)) {
                map.get(line);
                map.put(line, map.get(line) + 1);
            }
            else    {
                map.put(line,1);
            }
        }

        System.out.println(map);
        Map<String, Integer> sorted= map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e2,
                        LinkedHashMap::new));
        sorted.forEach((k,v) -> {
            System.out.println(k + ":  " + v );
        });
    }
}
