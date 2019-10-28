package Kolekcje;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task13 {
    int getNumberDifferentWords(List<String> words){
        Set<String> set = new HashSet<>(words);
        return set.size();
    }

}
