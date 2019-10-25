package metody;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(sumaCyfr(123));
        System.out.println(sumaCyfr(1023));
        System.out.println(sumaCyfr(1230));
    }
    public static int sumaCyfr(int k){
        int suma=0;
        while (k>0){
            suma+=k%10;
            k=k/10;
        }
        return suma;
    }
}
