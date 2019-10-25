package metody;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(divide(2,3));

    }
    public  static int divide(int a , int b){
        if (b==0){
            System.out.println("Nie mozna dzielic przez zerro");
            b=1;
        }
        return a/b;
    }
}
