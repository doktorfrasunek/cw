package rekrutacyjne;

public class Asseco2 {
    public int solution(int A[]){
        int length= A.length;
        if (length==1) return 0;
        int sum=0;
        for (int i :A) {
            sum+=i;
        }
        return sum < length-sum ? sum:length-sum;
    }

    public static void main(String[] args) {
        Asseco2 asseco2 = new Asseco2();
        int[] A= new int[] {0,1,1,0,0,0,0,1,0};
        int[] B= new int[] {0,1,1,1,1,1,1,1,0};
        int[] C= new int[] {1,1,1,1,1,1,1,1,1};
        int[] D= new int[] {0,0,0,0,0,0,0,0,0};
        int[] E= new int[] {1,1,1,1,0,0,0,0};
        System.out.println(asseco2.solution(A));
        System.out.println(asseco2.solution(B));
        System.out.println(asseco2.solution(C));
        System.out.println(asseco2.solution(D));
        System.out.println(asseco2.solution(E));
        System.out.println(asseco2.solution(new int[]{1}));
        System.out.println(asseco2.solution(new int[]{0}));
    }
}
