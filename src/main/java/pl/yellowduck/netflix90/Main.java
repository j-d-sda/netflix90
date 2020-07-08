package pl.yellowduck.netflix90;

import pl.yellowduck.resources.MainIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws  IOException {
        /*
        MainIO mainIO = new MainIO();

        mainIO.printDirectoryContent();
         */
        /*
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
        */
        /*
        String content = "This is the content to write into file\n";

        // If the file doesn't exists, create and write to it
        // If the file exists, truncate (remove all content) and write to it
        try (FileWriter writer = new FileWriter("C:\\Temp\\test_file.txt");
             BufferedWriter bw = new BufferedWriter(writer)) {

            bw.write(content);

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        */
        List<String> capitals = new ArrayList<String>();

        capitals.add("Warsaw");
        capitals.add("Berlin");
        capitals.add("Madrid");

        for(String capital : capitals) {
           if (capital.startsWith("W")) {
               StringBuilder sb = new StringBuilder();
               sb.append(capital);
               sb = sb.reverse();

               //reversedCapital = ;

               System.out.println(sb);
           }
        }
    }
}
