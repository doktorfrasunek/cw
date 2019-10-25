package Tablice;

public class Task1 {
    public static int first(int[]array){
        return array[0];
    }

    public static void main(String[] args) {
        System.out.println(first(new int[]{1,2,3}));
        System.out.println(first(new int[]{0,2,3}));
    }
}
