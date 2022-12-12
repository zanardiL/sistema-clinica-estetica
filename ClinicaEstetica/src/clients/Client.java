package clients;

import builders.ClientBuilder;

public class Client {
    private String id;
    private String name;
    private Address address;
    private String phone;
    private String email;

    private Client(ClientBuilder builder) {
        super();
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}

public static class ClientBuilder {
    private String id;
    private String name;
    private Address address;
    private String phone;
    private String email;

    public builders.ClientBuilder id(String id){
        this.id = id;
        return this;
    }

    public builders.ClientBuilder name(String name) {
        this.name = name;
        return this;
    }

    public builders.ClientBuilder Address(Address address) {
        this.address = address;
        return this;
    }

    public builders.ClientBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public builders.ClientBuilder email(String email) {
        this.email = email;
        return this;
    }


    public Client build() {
        Client client = new Client(this);
        validadeClientObject(client);
        return client;
    }
    private void validateClientObject(Client client) {
        //Do some basic validations to check
        //if user object does not break any assumption of system
    }
}
