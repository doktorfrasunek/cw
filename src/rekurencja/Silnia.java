package rekurencja;

public class Silnia {
    public static int silnia(int n){
        if (n==0) {
            return 1;
        }
        return n * silnia(n-1);
    }

    public static void main(String[] args) {
        System.out.println(silnia(3));
        System.out.println(silnia(4));
    }
}
