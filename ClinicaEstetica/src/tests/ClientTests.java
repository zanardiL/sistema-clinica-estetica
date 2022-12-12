package tests;

import clients.Client;
import builders.ClientBuilder;

public class ClientTests {
    public static void main(String[] args) {
        Client clientN1 = new Client.ClientBuilder()
                .name("Cecilia")
                .id("001");
    }
}
