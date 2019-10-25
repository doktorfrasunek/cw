package rekrutacyjneAPI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.stream.Collectors.toMap;

public class ReadAndCount {
    public static void main(String[] args) {
        File plik = new File("plik.txt");
        Map<String,Integer> map = new HashMap<>();
        try (Scanner scanner = new Scanner(plik)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
            if (map.containsKey(line)) {
                map.put(line, map.get(line) + 1);
            } else {
                map.put(line, 1);
            }
        }
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


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
