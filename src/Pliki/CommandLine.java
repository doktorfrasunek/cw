package Pliki;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandLine {
    String currentDir = File.listRoots()[0].getPath();

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine();
        System.out.println("Powitanie");
        Scanner scanner= new Scanner(System.in);
        String input="";
        while (true)
        {
            System.out.println(commandLine.currentDir);

            input=scanner.nextLine();
            if (input.equals("exit")) break;
            String[] command = input.split(" ");


        }

    }

}
