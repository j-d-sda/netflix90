package pl.yellowduck.resources;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;

import static org.junit.Assert.*;

public class VideoCasetteTest {
    @Test
    public void shouldVideoCasseteIsEqual() {
        //given
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
                "12345",
                BigDecimal.valueOf(100),
                "The Room",
                Category.DRAMA,
                actors,
                new Director("Tommy", "Wiseau", Sex.MALE)
        );

        //when
        boolean result = videoCasette01.equals(videoCasette02);
        //int v1HashCode = videoCasette01.hashCode();
        //int v2HashCode = videoCasette02.hashCode();

        //then
        Assertions.assertThat(result).isTrue();
        Assertions.assertThat(videoCasette01.hashCode()).isEqualTo(videoCasette02.hashCode());
    }

}