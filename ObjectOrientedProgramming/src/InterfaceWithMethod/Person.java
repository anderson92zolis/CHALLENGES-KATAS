package InterfaceWithMethod;

public class Person implements Habits{

    private String id;

    private String name;
    private Gender gender;

    private byte old;

    public Person (String id, String name,Gender gender, byte old) {
        this.id=id;
        this.name= name;
        this.gender=gender;
        this.old=old;
    }

    // getters


    public Gender getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public byte getOld() {
        return old;
    }

    // Setter


    public void setId(String id) {
        this.id = id;
    }

    public void setSex(Gender gender) {
        this.gender = gender;
    }

    public void setOld(byte old) {
        this.old = old;
    }

    public void printData(){
        System.out.println("your id is: "+ id+ " and your sex is: " +gender + " your age is : " + old);
    }


    @Override
    public void run() {

        System.out.println("I am running!!! ");

    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping!!! ");

    }


}
