package pl.yellowduck.resources;

import java.util.List;

public interface IVideoCasetteCatalog {
    void addVideoCasette(VideoCasette videoCasette);
    void addVideoCasette(VideoCasette... videoCasette);

    List<VideoCasette> getVideoCasettes();
}
