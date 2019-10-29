package Pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class liveWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/AkademiaKodu/Desktop/a.txt");
        PrintWriter printWriter = new PrintWriter(file);
        Scanner scanner= new Scanner(System.in);
        System.out.println("Proszę pisz");
        while (true){
            String line= scanner.nextLine();
            if (line.equals("exit")){
                printWriter.close();
                scanner.close();
                break;
            }
            printWriter.println(line);
            printWriter.flush();
        }
    }
}
