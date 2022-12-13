package tests;

import builders.AddressBuilder;
import clients.Address;
import clients.Client;
import builders.ClientBuilder;

public class ClientTests {
    public static void main(String[] args) {

        //Instanciando endereço utilizando o builder
        Address address1 = new AddressBuilder()
                .street("Rua 01")
                .state("Ilha de madagascar")
                .neighborhood("Reinado dos lemoris")
                .number("555")
                .zipCode("99.999-999")
                .build();

        //Instanciando um cliente utilizando o builder
        Client client1 = new ClientBuilder()
                .id("ABC01")
                .name("Rei Julian")
                .email("reijulian@gmail.com")
                .Address(address1)
                .build();

        System.out.println(client1);
    }
}
