package pl.yellowduck.resources;

public class Actor extends Person {
    public Actor(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }

    public void introduce() {
        /*
        if (this.sex == Sex.FEMALE)
            System.out.println("My name is " + firstName + " " + lastName + ". I am an actress.");
        else
            System.out.println("My name is " + firstName + " " + lastName + ". I am an actor.");
         */
        switch (this.sex) {
            case FEMALE: System.out.println("My name is " + firstName + " " + lastName + ". I am an actress."); break;
            case MALE: System.out.println("My name is " + firstName + " " + lastName + ". I am an actor."); break;
        }
    }
}
