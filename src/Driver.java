public class Driver extends Person {

    // instance method
    @Override
    public String getName (){
        return "Driver: " + super.name;
    }

    public Driver() {
    }

    public Driver(String name) {
        super(name);
    }
}