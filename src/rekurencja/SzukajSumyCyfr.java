package rekurencja;

public class SzukajSumyCyfr {
    public static int szukajLiczby(int i){
        int suma = 0;
        int temp= i;
        suma=sumaCyfr(i);
        if (suma>30){
            return i;
        }
        return szukajLiczby(i+1);
    }
    public static int sumaCyfr(int i){

        if (i<10){
            return i;
        }
        return i%10 + sumaCyfr(i/10);
    }
    public static void main(String[] args) {
        System.out.println(szukajLiczby(5));
    }
}
