package pl.yellowduck.resources;

import java.io.File;

public class MainIO {
    public static void printDirectoryContent() {
        String[] files;
        File file = new File("C:\\Users\\jd");

        files = file.list();

        for (String f : files) {
            System.out.println(f);
        }
    }
}
