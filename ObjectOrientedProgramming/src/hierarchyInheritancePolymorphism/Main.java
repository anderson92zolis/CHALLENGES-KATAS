package hierarchyInheritancePolymorphism;

public class Main {

    public static void main(String[] args) {

        System.out.println("12.1) Implement a class hierarchy with inheritance and polymorphism.");

        Car car= new Car("CAR","Mazda","4xt");
        Motorcycle motorcicle = new Motorcycle("MOTORCYCLE", "HONDA","3xrx");

        car.SoundVehicle("runrunCar");
        motorcicle.SoundVehicle("ronronMotorcicle");

    }
}