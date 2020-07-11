package pl.yellowduck.resources;

import java.util.ArrayList;
import java.util.List;

public class VideoCasetteCatalog implements IVideoCasetteCatalog {
    private final List<VideoCasette> casettes = new ArrayList<>();

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
    public List<VideoCasette> getVideoCasettes() {
        return casettes;
        //return null;
    }

}
