public class Pilot extends Person {

    // constructors
    public Pilot() {
    }

    public Pilot(String name) {
        super(name);
    }

    // instance method
    @Override
    public String getName (){
        return "Pilot: " + super.name;
    }


}