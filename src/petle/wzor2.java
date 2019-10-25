package petle;

import java.util.Scanner;

public class wzor2 {


    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
            Scanner scanner= new Scanner(System.in);
            int z=scanner.nextInt();
            for (int i = 0; i <2*z+1 ; i++) {
                for (int j = 0; j <2*z+1 ; j++) {
                    int cyfra = z;
                    for (int k = 0; k <= z; k++) {
                        if (i==z-k || i==z+k || j==z+k || j==z-k)
                            cyfra =  k;
                    }
                    System.out.print(cyfra + " ");

                }
            System.out.println();
        }

    }
}
