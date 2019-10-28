package Kolekcje;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int i = scanner.nextInt();
        Deque<Integer> stack = new ArrayDeque<Integer>();
        while (i>0){
            stack.push(i%2);
            i=i/2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
