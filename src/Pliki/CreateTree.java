package Pliki;

import java.io.File;
import java.io.IOException;

public class CreateTree {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/AkademiaKodu/Desktop";
        String pathA= path + "/A";
        File file= new File(pathA);
        file.mkdir();
        file= new File(pathA+"/B");
        file.mkdir();
        file= new File(pathA+"/B/C.txt");
        file.createNewFile();
        file= new File(pathA+"/B/D.txt");
        file.createNewFile();
        file= new File(pathA+"/B/E.txt");
        file.createNewFile();
        String pathF = path+"/F";
        file= new File(pathA+"/F");
        file.mkdir();
        file= new File(pathA+"/F/G");
        file.mkdir();
        file= new File(pathA+"/F/H.txt");
        file.createNewFile();

    }
}
