package metody;

public class Task8 {
    public static void main(String[] args) {

        System.out.println(1 + " " + potega(1));
        System.out.println(4 + " " + potega(4));
        System.out.println(15 + " " + potega(15));
        System.out.println(64 + " " + potega(64));
        System.out.println(10001 + " " + potega(10001));
        System.out.println(7 + " " + potega(7));
        System.out.println(0+ " " + potega(0));
        System.out.println(64000001 + " " + potega(64000001));

    }
    public static boolean potega(int k){
        return Math.sqrt(k) % 1 == 0 ;
    }
}
