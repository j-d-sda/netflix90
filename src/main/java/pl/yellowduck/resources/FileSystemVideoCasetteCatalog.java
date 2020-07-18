package pl.yellowduck.resources;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileSystemVideoCasetteCatalog extends UniqueVideoCasetteCatalog {
    private final Path file = new Paths.get("casettes.txt");

    public final ObjectMapper objectMapper = new ObjectMapper();

    public FileSystemVideoCasetteCatalog() {
        try (BufferedReader bufferedReader = Files.newBufferedReader(file)) {;
            String line;
            while (line = bufferedReader.readLine()) {
                VideoCasette videoCasette = objectMapper.readValue(line, VideoCasette.class);
                super.addVideoCasette(videoCasette);
        }
        catch (IOException | CasetteAddException e) {
            throw new CasetteReadException;
        }
    }

    @Override
    public void addVideoCasette(VideoCasette videoCasette) throws CasetteAddException {
        super.addVideoCasette(videoCasette);

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND);) {
            String string = objectMapper.writeValueAsString(videoCasette);
            bufferedWriter.write(string);
        }
        catch (FileNotFoundException e) {
            throw new CasetteAddException();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addAll(VideoCasette videoCasette) throws CasetteAddException {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND);) {
            for (VideoCasette videoCasette : videoCasette) {
                String string = objectMapper.writeValueAsString(videoCasette);
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }

        }
        catch (FileNotFoundException e) {
            throw new CasetteAddException();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
