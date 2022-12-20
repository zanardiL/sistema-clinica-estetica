package tests;

import builders.AddressBuilder;
import business.object.client.Address;
import business.object.client.Client;
import builders.ClientBuilder;
import business.object.PackageDeals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestClinic {
    public static void main(String[] args) {

        //Instanciando os pacotes oferecidos pela clínica
        //em uma lista
        List<PackageDeals> offeredPackages = new ArrayList<>();
        offeredPackages.add(
                new PackageDeals(
                        "Simples",
                        "Limpeza de pele",
                        2,
                        BigDecimal.valueOf(180)
                ));

        offeredPackages.add(
                new PackageDeals(
                        "Golden",
                        "Massagem e esfoliação corporal",
                        2,
                        BigDecimal.valueOf(120)
                ));

        offeredPackages.add(
                new PackageDeals(
                        "Platinum",
                        "Drenagem linfática e tratamento capilar",
                        3,
                        BigDecimal.valueOf(300)
                ));
        System.out.println(offeredPackages);

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
