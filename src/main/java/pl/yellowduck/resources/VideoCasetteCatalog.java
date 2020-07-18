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
    public void addVideoCasette(VideoCasette videoCasette) throws CasetteAddException {
        if (casettes.add(videoCasette)) {
            throw new CasetteAddException("Casette already added!");
        }
    }

    @Override
    public void addVideoCasette(VideoCasette... videoCasette) throws CasetteAddException   {
        for (VideoCasette casette : videoCasette) {
            addVideoCasette(casette);
        }
    }

    @Override
    public List<VideoCasette> getVideoCasettes() {
        return casettes;
        //return null;
    }

}
