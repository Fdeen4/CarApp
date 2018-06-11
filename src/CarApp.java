public class CarApp {

    public static void main(String[] args) {
        // Create two instances of cars
        Car porsche = new Car (50, "Porsche", "red");
        Car Jetta = new Car (90, "Jetta", "blue");

        // Call the methods for each car one after the other
        System.out.println(porsche.start());
        System.out.println(Jetta.start());
        System.out.println(porsche.accelerate());
        System.out.println(Jetta.accelerate());
        System.out.println(Jetta.emissionTest());
        System.out.println(Jetta.PassemissionTest());
        System.out.println(porsche.currentSpeed());
        System.out.println(porsche.stop());
        System.out.println(Jetta.passMake());
    }
}