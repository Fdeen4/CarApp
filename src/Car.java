public class Car extends Vehicle {

    //instance variables
    private String make;
    private String color;

    //constructors
    public Car () {}

    public Car (int speed, String make, String color) {
        super (speed);
        this.make = make;
        this.color = color;
    }

    //instance methods
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String start () {
        return "The " + color + " " + make + " is starting";
    }

    public String accelerate () {
        return "The " + color + " " + make + " is accelerating";
    }

    public String currentSpeed () {
        return "The " + color + " " + make + " is going " + super.speed +
                " " + "mph";
    }
    public String stop () {
        return "The " + color + " " + make + " is stopped";
    }
    public String emissionTest () {
        return "The " + color + " " + make + " has stopped to have its emissions checked";
    }
    public String PassemissionTest () {
        return "The " + color + " " + make + " passes its emission test";
    }
    public String passMake (){
        return  "The " + color + " " + make + " just passed the red Porsche";
    }


    }
