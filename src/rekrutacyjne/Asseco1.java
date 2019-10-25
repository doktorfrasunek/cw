package rekrutacyjne;

public class Asseco1 {
    public int solution(int A[]){
        int sum=0;
        for (int i :A) {
            if (i%2==0) sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Asseco1 asseco1 = new Asseco1();
        int[] A= new int[] {-6,-91,1011,-100,84,-22,0,1,473};
        System.out.println(asseco1.solution(A));
    }
}
