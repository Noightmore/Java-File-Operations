package hak.main;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String input;
        File soubor;
        Path _path;
        do{
            input = sc.nextLine().trim();
            if(!input.equalsIgnoreCase("exit")){
                if(input.equals("")) input = System.getProperty("user.dir");
                soubor = new File(input);
                //System.out.println(input);
                System.out.println(soubor.getName());
                System.out.println(soubor.exists());
                System.out.println(soubor.isAbsolute());
                System.out.println(soubor.getParent());
                System.out.println(soubor.isFile());
                System.out.println(soubor.isDirectory());

                System.out.println(soubor.getCanonicalPath());
                System.out.println(soubor.getAbsolutePath());
                System.out.println();

                _path = Paths.get(input);

                System.out.println(_path.getRoot());
                System.out.println(_path.getFileSystem());
                System.out.println(_path.getNameCount());
                System.out.println(_path.toAbsolutePath());
                System.out.println(_path.normalize());

                if(soubor.isDirectory()){
                    String[] poleTextovychRetezcu = soubor.list();
                    assert poleTextovychRetezcu != null;
                    for (String s :
                            poleTextovychRetezcu) {
                        System.out.println( new File(s).isDirectory()? "adresar": "je soubor");
                    }
                }
            }


        }while(input.compareToIgnoreCase("exit") !=0);
    }
}
