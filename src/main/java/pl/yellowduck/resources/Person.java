package pl.yellowduck.resources;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected final Sex sex;

    public Person(String firstName, String lastName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public abstract void introduce();

    public String toString() {
        return firstName + " " + lastName;
    }
}
