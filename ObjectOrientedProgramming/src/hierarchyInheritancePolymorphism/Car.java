package hierarchyInheritancePolymorphism;

public class Car extends Vehicle {

    private static String motor;

    public Car(String typeOfVehicle, String modelVehicle, String motor) {
        super(typeOfVehicle, modelVehicle);
        this.motor=motor;
    }

    public void SoundVehicle(String soundCar){
        System.out.println("The sound of  + " + super.typeOfVehicle +" is : "  + soundCar);
    }

}
