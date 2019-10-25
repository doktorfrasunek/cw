package Tablice;

import java.util.Arrays;

public class Task11 {
   static int[] mySort(int[] T){
       Arrays.sort(T);
       return T;
    }

    public static void main(String[] args) {
        int[] T= new int[]{2,3,1,5,0,9};
        mySort(T);
        for (int i:
             T) {
            System.out.println(i);

        }
    }
}
