package rekrutacyjne;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Temperature {
    public static String solution(int[]T){
        int length =T.length;

        Map<String,Integer> map= new HashMap<>();

        map.put("winter",getAmplitude(Arrays.copyOfRange(T,0,length/4)));

        map.put("spring",getAmplitude(Arrays.copyOfRange(T,length/4,2*length/4)));

        map.put("summer",getAmplitude(Arrays.copyOfRange(T,2*length/4,3*length/4)));

        map.put("autumn",getAmplitude(Arrays.copyOfRange(T,3*length/4,length)));
        String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        return key;
    }
    private static int getAmplitude(int T[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int length = T.length;
        for (int index = 0; index<length; index++){
            min = T[index]<min ? T[index]:min;
            max = T[index]>max ? T[index]:max;
        }
        return max - min;
    }
}
