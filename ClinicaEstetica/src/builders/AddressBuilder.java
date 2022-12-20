package builders;

import business.object.client.Address;

public class AddressBuilder {
    private String street;
    private String number;
    private String zipCode;
    private String neighborhood;
    private String state;

    public AddressBuilder street(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder number(String number) {
        this.number = number;
        return this;
    }

    public AddressBuilder zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public AddressBuilder neighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    public AddressBuilder state(String state) {
        this.state = state;
        return this;
    }

    public Address build() {
        Address address = new Address(street, number, neighborhood, zipCode, state);
        return address;
    }
}
