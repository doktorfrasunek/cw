package metody;

public class Task16 {

    public static void main(String[] args) {
        System.out.println(isPesel("12345678901"));
        System.out.println(isPesel("1234567890"));
        System.out.println(isPesel("12345678_01"));
    }

    public static boolean isPesel(String a) {
        if (a.length() != 11) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (!Character.isDigit(a.charAt(i))) {
                return false;
            }

        }
        return true;
    }
}