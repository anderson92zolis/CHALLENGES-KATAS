package hierarchyInheritancePolymorphism;

public class Motorcycle extends Vehicle {

    private  String motor;

    public Motorcycle(String typeOfVehicle, String modelVehicle, String motor) {
        super(typeOfVehicle, modelVehicle);
        this.motor=motor;
    }

    public void SoundVehicle(String soundMotorcicle){
        System.out.println("The sound of  + " + super.typeOfVehicle + " is : "  + soundMotorcicle);
    }

}
