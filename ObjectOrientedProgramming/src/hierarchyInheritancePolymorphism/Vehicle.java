package hierarchyInheritancePolymorphism;

import jdk.dynalink.beans.StaticClass;

public class Vehicle {

    final String typeOfVehicle;
    private String modelVehicle;


    public Vehicle(String typeOfVehicle,String modelVehicle ) {
        this.typeOfVehicle = typeOfVehicle;
        this.modelVehicle = modelVehicle;
    }

    public void SoundVehicle(String sound){
        System.out.println("The sound is :"  + sound);
    }

}
