package rekrutacyjne;

public class Solution {
    public  String solution(String s) {

        StringBuilder result= new StringBuilder(s.replaceAll("[ | -]+", ""));
        int index=3;
        int length=result.length();
        if (length==4){
            result.insert(2, '-');
            System.out.println(index + " " + length);
        }
        if (length>4){
            result.insert(index, '-');
            index+=4;
            System.out.println(index + " " + length);
        }
        while(index < result.length()-5){
            result.insert(index, '-');
            index+=4;
        }
        if (result.length()-index==4){
            System.out.println(result);
            result.insert(index+3, '-');
        }
        if (result.length()-index==5){
            result.insert(index, '-');
            result.insert(index+4, '-');
        }
        else result.insert(index, '-');
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        //System.out.println(solution.solution("1234567"));
        System.out.println(solution.solution("1234"));
        //System.out.println(solution.solution("1234567890"));
    }
}
