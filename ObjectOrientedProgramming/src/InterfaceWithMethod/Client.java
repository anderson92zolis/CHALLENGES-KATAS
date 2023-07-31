package InterfaceWithMethod;

public class Client extends Person{


    public Client(String id, String name, Gender gender, byte old) {
        super(id, name, gender, old);
    }

    public void sleep() {
        System.out.println("The client can't sleep in the working hours bbbeeeeeppp");

    }

}
