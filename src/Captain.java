public class Captain extends Person {
    // constructors
    public Captain() {
    }

    public Captain(String name) {
        super(name);
    }

    // instance method
    @Override
    public String getName (){
        return "Captain: " + super.name;
    }


}