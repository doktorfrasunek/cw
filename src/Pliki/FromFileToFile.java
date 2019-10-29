package Pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FromFileToFile {


    public static void main(String[] args) throws FileNotFoundException {
        File liczby = new File("C:/Users/AkademiaKodu/Desktop/liczby.txt");
        File slowa = new File("C:/Users/AkademiaKodu/Desktop/slowa.txt");
        File wynik = new File("C:/Users/AkademiaKodu/Desktop/wynik.txt");
        PrintWriter printWriter = new PrintWriter(wynik);
        Scanner scannerLiczby = new Scanner(liczby);
        Scanner scannerSlowa = new Scanner(slowa);
        while (scannerLiczby.hasNext() && scannerSlowa.hasNext()) {
            printWriter.println(scannerLiczby.nextLine() + ". " + scannerSlowa.nextLine());
            printWriter.flush();
        }
        scannerLiczby.close();
        scannerSlowa.close();
        printWriter.close();

    }
}