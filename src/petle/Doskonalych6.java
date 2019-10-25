package petle;

public class Doskonalych6 {
    static int[] pierwsze= new int[]{2,3,5,7,11,13};

    public static void main(String[] args) {
        for (int i :pierwsze
             ) {
            System.out.println( (Math.pow(2,i)-1)*(Math.pow(2,i-1)));

        }
    }

}
