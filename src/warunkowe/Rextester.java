package warunkowe;

import java.util.Scanner;

class Rextester
{public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int min = a > b ? a : b;
    System.out.println(min);
}
}
