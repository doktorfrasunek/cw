package metody;

public class Task12 {
    public static void main(String[] args) {
        for (int i = 0; i <129 ; i++) {
            System.out.println(i + " " + szczescian(i));
        }

    }
    private static boolean szczescian(int k){
        Double pierw= Math.pow(k, 1.0/3.0);
        int ceil = (int) Math.ceil(pierw);
        int floor = (int) Math.floor(pierw);
        if (floor*floor*floor== k)
                return true;
        if (ceil*ceil*ceil== k)
            return true;
        return false;
    }
}
