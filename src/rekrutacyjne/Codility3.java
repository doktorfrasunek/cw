package rekrutacyjne;

public class Codility3 {
    public int solution(int[] A){
        int lenght=1;
        int index=0;
        while (A[index]!=-1){
            lenght++;
            index=A[index];
        }
        return lenght;

    }
}
