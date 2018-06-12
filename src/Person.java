abstract class Person {

    // instance variables
    protected String name;

    // constructors

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    // instance methods


    abstract String getName();

    public void setName(String name) {
        this.name = name;
    }
}