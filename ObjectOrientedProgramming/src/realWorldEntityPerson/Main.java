package realWorldEntityPerson;

public class Main {

    public static void main(String[] args) {

        System.out.println("12.2) Create classes to represent real-world entities (e.g., Person, Animal, Car) with appropriate properties and methods.");
        Person person = new Person("1", "Scaler",Gender.MALE, (byte) 21);
        person.printData();
    }
}