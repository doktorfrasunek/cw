package metody;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("ala" + " " + palindrom("ala"));
        System.out.println("alan" + " " + palindrom("alan"));
        System.out.println("a" + " " + palindrom("a"));
        System.out.println("Ala" + " " + palindrom("Ala"));
    }
    public static boolean palindrom(String a){
        return a.equalsIgnoreCase(
                new StringBuilder(a)
                        .reverse()
                        .toString());
    }
}
