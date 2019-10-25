package rekrutacyjne;

public class Square {
    public static int solution(int a , int b){
        if (a<0) a=0;
        if (b<0) b=0;
        double maxSquare= Math.sqrt(b);
        double minSquare= Math.sqrt(a);
        int difference = ((int)maxSquare-(int)minSquare);
        if (minSquare== (int) Math.sqrt(a))
            difference++;
        return difference;
    }

    public static void main(String[] args) {
        System.out.println(solution(-2,2));
        System.out.println(solution(4,16));
        System.out.println(solution(4,15));
        System.out.println(solution(3,17));
        System.out.println(solution(3,16));
        System.out.println(solution(3,15));
        System.out.println(solution(5,17));
        System.out.println(solution(5,16));
        System.out.println(solution(5,15));

    }
}
