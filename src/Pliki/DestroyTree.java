package Pliki;

import java.io.File;

public class DestroyTree {
    public static void main(String[] args) {
        String path = "C:/Users/AkademiaKodu/Desktop/A";
        File file = new File(path);
        destroy(file);

    }
    public static void destroy(File file){
        for (File f:
             file.listFiles()) {
            if (f.isDirectory()){
                destroy(f);
            }
            else if (f.isFile()){
                f.delete();
            }

        }
        file.delete();
        File.listRoots();
    }
}
