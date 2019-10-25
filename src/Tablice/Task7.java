package Tablice;

public class Task7 {
    static int sum(int[]T){
        int sum=0;
        for (int i:
             T) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(
                new int[]{1,2,3}
        ));
    }
}
