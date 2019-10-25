package rekrutacyjne;

public class Codility2 {
    public boolean solution(int A[], int K) {

        if (A[0]!=1){
            return false;
        }
        for (int i = 1; i < A.length; i++) {

            if (A[i] - A[i-1] > 1) {
                    return false;
                }

        }
        return A[A.length-1]==K;
    }

    public static void main(String[] args) {
        Codility2 codility2= new Codility2();
        int[]A= new int[]{1,2,2,3,3,4,5};
        int k= 5;
        System.out.println(codility2.solution(A,k));
    }
}
