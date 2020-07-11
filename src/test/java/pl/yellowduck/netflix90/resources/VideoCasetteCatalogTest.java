package pl.yellowduck.netflix90.resources;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import pl.yellowduck.resources.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static java.util.Set.*;

public class VideoCasetteCatalogTest {
    @Test
    public void shouldAddVideoCasetteToCatalog() {
        // given - warunki brzegowe do wykonania danego scenariusza przypadku użycia

        Actor actorJuliette = new Actor("Juliette", "Danielle", Sex.FEMALE);
        HashSet<Actor> actors = new HashSet<Actor>();
        actors.add(actorJuliette);

        VideoCasetteCatalog catalog  = new VideoCasetteCatalog();
        VideoCasette videoCasette = new VideoCasette(
                "12345",
                BigDecimal.valueOf(100),
                "The Room",
                Category.DRAMA,
                actors,
                new Director("Tommy", "Wiseau", Sex.MALE)
        );

        // when

        catalog.addVideoCasette(videoCasette);

        // then

        Assertions.assertThat(catalog.getVideoCasettes())
            .hasSize(1);
    }
}
