package warunkowe;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int min;
        char a= 'a';
        System.out.println(a+2);
        Scanner scanner = new Scanner(System.in);
        min= scanner.nextInt();
        int temp = scanner.nextInt();
        min =temp < min ? temp : min;
        temp = scanner.nextInt();
        min =temp < min ? temp : min;
        System.out.println(min);


    }
}
