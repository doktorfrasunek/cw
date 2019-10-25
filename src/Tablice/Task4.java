package Tablice;

public class Task4 {
    int sumArray(int T[]){
        return T[0]+T[T.length-1];
    }

    public static void main(String[] args) {
        Task4 task4= new Task4();
        System.out.println(task4.sumArray(new int[]{1,2,3}));
    }
}
