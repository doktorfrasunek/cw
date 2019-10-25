package metody;

public class Task13 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "  " + pierwsza(i));
        }
    }

    public static boolean pierwsza(int k){
        if (k==1) return false;
        int pierwiastek = (int)  Math.sqrt(k) ;
        for (int i = 2; i <=pierwiastek ; i++) {
            if (k%i==0) return false;
        }
        return true;
    }
}
