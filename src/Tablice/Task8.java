package Tablice;

public class Task8 {
    static int max(int[]T){
        int max=T[0];
        for (int i:
                T) {
            max= max>i ? max:i;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max(
                new int[]{1,2,3,8,2}
        ));
    }
}
