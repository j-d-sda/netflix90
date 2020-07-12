package pl.yellowduck.resources;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class FileSystemVideoCasetteCatalog extends UniqueVideoCasetteCatalog {
    private final Path file = new Paths.get("casettes.txt");

    @Override
    public void addVideoCasette(VideoCasette videoCasette) {
        super.addVideoCasette(videoCasette);

        try {
            BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
