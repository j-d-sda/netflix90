package pl.yellowduck.resources;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueVideoCasetteCatalog implements IVideoCasetteCatalog {
    private final HashSet<VideoCasette> casettes = new HashSet<>();

    /*
    public VideoCasetteCatalog(List<VideoCasette> casettes) {
        this.casettes = new ArrayList<>();
    }
    */

    @Override
    public void addVideoCasette(VideoCasette videoCasette) {
        casettes.add(videoCasette);
    }

    @Override
    public void addVideoCasette(VideoCasette... videoCasette) {
        for (VideoCasette casette : videoCasette) {
            addVideoCasette(casette);
        }
    }

    @Override
    public List<VideoCasette> getVideoCasettes() {
        return new ArrayList<>(casettes);
        //return null;
    }
}
