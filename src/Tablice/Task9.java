package Tablice;

public class Task9 {
    static int[] swap(int[] T){
        int length = T.length;
        int[] result = new int[length];
        for (int i = 0; i <length  ; i++) {
            result[i]=T[length -1-i];
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i:
             swap(new int[]{1,2,3})) {
            System.out.println(i);
        }
    }

}
