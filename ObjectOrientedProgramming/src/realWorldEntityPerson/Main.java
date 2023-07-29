package realWorldEntityPerson;

public class Main {

    public static void main(String[] args) {

        System.out.println("12.2) Create classes to represent real-world entities (e.g., Person, Animal, Car) with appropriate properties and methods.");
        Person person1 = new Person("1", "Scaler",Gender.MALE, (byte) 21);
        person1.printData();
        Person person2 = new Person("2", "Juana",Gender.FEMALE, (byte) 30);
        person2.printData();
    }

}