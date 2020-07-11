package pl.yellowduck.netflix90.resources;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import pl.yellowduck.resources.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static java.util.Set.*;

public class VideoCasetteCatalogTest {

    // metoda sprawdza, czy katalog jest wejściowo pusty
    public void shouldCreateCatalogThatIsEmpty() {
        // given

        // when
        IVideoCasetteCatalog catalog = new VideoCasetteCatalog();

        // then
        Assertions.assertThat(catalog.getVideoCasettes()).isEmpty();
    }

    @Test
    public void shouldAddVideoCasetteToCatalog() {
        // given - warunki brzegowe do wykonania danego scenariusza przypadku użycia

        Actor actorJuliette = new Actor("Juliette", "Danielle", Sex.FEMALE);
        HashSet<Actor> actors = new HashSet<Actor>();
        actors.add(actorJuliette);

        IVideoCasetteCatalog catalog = new VideoCasetteCatalog();
        //VideoCasetteCatalog catalog  = new VideoCasetteCatalog();
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

    @Test
    public void shouldAddTwoVideoCasettesToCatalog() {
        Actor actorJuliette = new Actor("Juliette", "Danielle", Sex.FEMALE);
        HashSet<Actor> actors = new HashSet<Actor>();
        actors.add(actorJuliette);

        IVideoCasetteCatalog catalog = new VideoCasetteCatalog();
        //VideoCasetteCatalog catalog  = new VideoCasetteCatalog();
        VideoCasette videoCasette01 = new VideoCasette(
                "12345",
                BigDecimal.valueOf(100),
                "The Room",
                Category.DRAMA,
                actors,
                new Director("Tommy", "Wiseau", Sex.MALE)
        );

        VideoCasette videoCasette02 = new VideoCasette(
                "23456",
                BigDecimal.valueOf(100),
                "The Room",
                Category.DRAMA,
                actors,
                new Director("Tommy", "Wiseau", Sex.MALE)
        );
        // when

        catalog.addVideoCasette(videoCasette01);
        catalog.addVideoCasette(videoCasette02);

        // then

        Assertions.assertThat(catalog.getVideoCasettes())
                .hasSize(2);
    }
}
