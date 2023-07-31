package InterfaceWithMethod;

public class Main {

    public static void main(String[] args) {

        System.out.println("12.2) Create classes to represent real-world entities (e.g., Person, Animal, Car) with appropriate properties and methods.");
        Person person1 = new Person("1", "Scaler", Gender.MALE, (byte) 21);
        person1.printData();
        person1.run();

        //  Person 2

        Person person2 = new Person("2", "Juana",Gender.FEMALE, (byte) 30);
        person2.printData();
        person2.sleep();


        System.out.println("12.4) Use encapsulation to hide internal implementation details.");

        System.out.println("the ID of a person one is: : " + person1.getId() + " and the gender is: " + person1.getGender());
        person1.setId("123");
        System.out.println("the NEW ID of a person one is: : " + person1.getId() + " and the gender is: " + person1.getGender());

    }

}