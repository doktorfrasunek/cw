package Tablice;

public class Task6 {
    static int[]  plusTwoArrays(int[]a , int[]b){
      return new int[]{a[0],a[1],b[0],b[1]};
    }

    public static void main(String[] args) {
        for (int i :
                plusTwoArrays(
                        new int[]{2,3},
                        new int[]{4,5}
                )) {
            System.out.println(i);

        }
    }
}
