package pl.yellowduck.netflix90;

import pl.yellowduck.resources.MainIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws  IOException {
        /*
        MainIO mainIO = new MainIO();

        mainIO.printDirectoryContent();
         */

        Path path = Paths.get("C:\\Temp\\test_file.txt");

        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(String l : lines) {
            System.out.println(l);
        }

    }
}
