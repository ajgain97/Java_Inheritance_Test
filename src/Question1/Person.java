package Question1;

public class Person {
    // data fields
    private String name;
    private String address;

    // no arg constructor
    public Person() {}

    // constructor to set name and address
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // get the name
    public String getName() {
        return name;
    }

    // set the name
    public void setName(String name) {
        this.name = name;
    }

    // get the address
    public String getAddress() {
        return address;
    }


    // set the address
    public void setAddress(String address) {
        this.address = address;
    }

    // convert to string
    public String toString() {
        return name + ": " + address;
    }
}