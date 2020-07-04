package pl.yellowduck.resources;

public class Director extends Person {
    public Director(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }

    public void introduce() {
        System.out.println("My name is " + firstName + " " + lastName + ". I am director.");
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
