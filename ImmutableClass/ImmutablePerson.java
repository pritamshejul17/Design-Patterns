package ImmutableClass;

public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final Address address; // Using the Address class from above

    public ImmutablePerson(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address.getCity(), address.getState()); // Creating a defensive copy
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getState()); // Returning a defensive copy
    }
}
