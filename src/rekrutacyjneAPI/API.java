package rekrutacyjneAPI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class API {
    public static void main(String[] args) {
        File plik = new File("nazwa_pliku.txt");
        try (Scanner scanner = new Scanner(plik)) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
