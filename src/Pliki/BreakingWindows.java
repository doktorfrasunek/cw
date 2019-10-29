package Pliki;

import java.io.File;
import java.io.IOException;

public class BreakingWindows {
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


    public static void main(String[] args) throws IOException {
        String path = "C:/Users/AkademiaKodu/Desktop/";
        for (int i =1; i <= 2; i++) {
            String pathA= path+i+"/";
            for (int j = 0; j < i ; j++) {
                File file = new File(pathA);
                file.mkdir();
                if (j== i-1){
                    pathA=pathA+"tajny"+i+".txt";
                    file = new File(pathA);
                    file.createNewFile();
                    System.out.println(file.getPath());

                }
                pathA=pathA+"a/";

            }

        }

        for (int i = 0; i <10000 ; i++) {
            String pathA= path+i+"/";
            File file= new File(pathA);
            if (file.isDirectory())
                destroy(file);
        }
    }
}
