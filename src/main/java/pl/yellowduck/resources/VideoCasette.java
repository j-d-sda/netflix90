package pl.yellowduck.resources;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

public class VideoCasette {
    private String id;
    private BigDecimal price;
    private String title;
    private Category category;
    private Set<Actor> actors;
    private Director director;

    public VideoCasette(String id, BigDecimal price, String title, Category category, Set<Actor> actors, Director director) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.category = category;
        this.actors = actors;
        this.director = director;
    }
    
    public void printOut() {
        StringBuilder builder = new StringBuilder();
        
        builder.append(this.id)
                .append("|")
                .append(this.price)
                .append("|")
                .append(this.title)
                .append("|")
                .append(this.category)
                .append("|")
                .append(this.director)
                .append("|")
                .append(this.actors);
        System.out.println(builder.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoCasette that = (VideoCasette) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
