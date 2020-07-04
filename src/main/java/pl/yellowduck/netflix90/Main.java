package pl.yellowduck.netflix90;

import pl.yellowduck.resources.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Tommy", "Wiseau", Sex.MALE);
        Actor tommyActor = new Actor ("Tommy", "Wiseau", Sex.MALE);
        Actor julietteActor = new Actor ("Juliette", "Danielle", Sex.FEMALE);
        Actor gregActor = new Actor ("Greg", "Sastero", Sex.MALE);
        /*
        List<Person> persons = new ArrayList<>();

        persons.add(director);
        persons.add(tommyActor);
        persons.add(julietteActor);
        persons.add(gregActor);
        */
        Set<Actor> actors = new HashSet<Actor>();

        actors.add(tommyActor);
        actors.add(julietteActor);
        actors.add(gregActor);

        /*
        for (Person person : persons) {
            person.introduce();
        }

        System.out.println("Hello Netflix90");
        */

        VideoCasette theRoom = new VideoCasette(
                "12345",
                BigDecimal.valueOf(100),
                "The Room",
                Category.DRAMA,
                actors,
                director
        );
        theRoom.printOut();
    }
}
/*
public class Main {
  public static void main(String[] args) {
    Director director = new Director("Tommy", "Wiseau", Sex.MALE);
    Actor tommyActor = new Actor ("Tommy", "Wiseau", Sex.MALE);
    Actor julietteActor = new Actor ("Juliette", "Danielle", Sex.FEMALE);
    Actor gregActor = new Actor ("Greg", "Sastero", Sex.MALE);
    Set<Person> persons = new HashSet<>();

    persons.add(director);
    persons.add(tommyActor);
    persons.add(julietteActor);
    persons.add(gregActor);

    for (Person person : persons) {
      person.introduce();
    }

    System.out.println("Hello Netflix90");
  }
}
*/