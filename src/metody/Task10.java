package metody;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(maxStringLength("ssss","sssssasa"));
        System.out.println(maxStringLength("ssss","aaa"));
    }

    public static int maxStringLength(String a, String b){
        return a.length()>b.length() ? a.length() : b.length();
    }
}
