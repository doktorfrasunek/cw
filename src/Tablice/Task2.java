package Tablice;

public class Task2 {
    public static int first(int[]array){
        return array[array.length-1];
    }

    public static void main(String[] args) {
        System.out.println(first(new int[]{1,2,3}));
        System.out.println(first(new int[]{0,2,3}));
    }
}
