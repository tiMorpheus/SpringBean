package github.tiMorpheus.common;

public class Customer {

    private Person person;

    public Customer() {
    }

    public Customer(Person person) {
        this.person = person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer [person=" + person + "]";
    }
}
