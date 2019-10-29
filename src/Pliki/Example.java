package Pliki;

import java.io.File;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\AkademiaKodu\\Desktop");

//      file.delete();
//      file.createNewFile();
//      file.mkdir();
//      file.delete();

//      file.canExecute();
//      file.canRead();
//      file.canWrite();

//      file.exists();
//      System.out.println(file.getAbsolutePath());
//      System.out.println(file.getName());
//      System.out.println(file.getParent());
//      System.out.println(file.isDirectory());
//      System.out.println(file.isFile());


//      for(String path : file.list())
//          System.out.println(path);

        File[] files = file.listFiles();

        for(File f : files)
            if(f.isDirectory())
                System.out.println(f.getName() + "\tJestem folderem");
            else
                System.out.println(f.getName() + "\tJestem plikiem");

    }
}
