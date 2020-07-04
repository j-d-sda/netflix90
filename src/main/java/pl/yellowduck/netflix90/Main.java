package pl.yellowduck.netflix90;

import pl.yellowduck.resources.Person;
import pl.yellowduck.resources.Actor;
import pl.yellowduck.resources.Director;
import pl.yellowduck.resources.Sex;

import java.util.HashSet;
import java.util.Set;


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
