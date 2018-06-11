public class Vehicle {

    //instance variables
    protected int speed;

    // constructors
    protected Vehicle () {}
    protected Vehicle (int speed) {
        this.speed = speed;
    }

    // instance methods
    protected int getSpeed () {
        return this.speed;
    }

    protected String setSpeed (int speed) {
        this.speed = speed;
        return "The speed is " + this.speed;
    }
}