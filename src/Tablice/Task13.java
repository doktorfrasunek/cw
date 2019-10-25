package Tablice;

public class Task13 {
    static String[] fiveletters(String[] T) {
        return reku(T,0,0);
    }

     static String[] reku(String[] T, int count, int index) {
        String[] result;
        if (index == T.length) {
            return new String[count];
        }
        if (T[index].length() == 5) {
            count++;
            result = reku(T, count, index + 1);
            result[count - 1] = T[index];
        } else {
            result = reku(T, count, index + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] T = new String[]{
                "wqre",
                "00000",
                "wqre",
                "wqre",
                "wqre",
                "11111",
                "wqre",
        };
        T=fiveletters(T);
        for (String a:
             T) {
            System.out.println(a);
        }
        System.out.println(T.length);
    }
}