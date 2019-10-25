package Tablice;

public class Task5 {
    static int middleElement(int[] T){
        return T[(T.length-1)/2];
    }

    public static void main(String[] args) {
        System.out.println(
                middleElement(
                        new int[]
                                {1,2,3,4,5}));
        System.out.println(
                middleElement(
                        new int[]
                                {1,5,3,4}));
    }
}
