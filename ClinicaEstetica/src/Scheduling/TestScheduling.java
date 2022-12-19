package Scheduling;

import builders.Address;
import builders.Client;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TestScheduling {

    public static void main(String[] args) {

        Client client1 = new Client("1", "Caterine",
                new Address("Marau", "12", "96090-720", "Laranjal", "RS")
                , "53-981312781", "emaildacaterine@gmail.com");
        Client client2 = new Client("2", "Laís",
                new Address("Embaú", "265", "96090-600", "Carvalhal", "SC")
                , "53-99853654", "emaildalais@gmail.com");
        Client client3 = new Client("3", "Julia",
                new Address("Antoninho Afonso", "789", "96090-554", "Retiro", "SP")
                , "53-981556123", "emaildajulia@gmail.com");
        Client client4 = new Client("4", "Flávia",
                new Address("Jaguariúna", "66", "96080-100", "Videira", "AL")
                , "53-974563215", "emaildaflavia@gmail.com");


        List<Scheduling> schedulingIn = new ArrayList<>();
        schedulingIn.add(new Scheduling(client1,
                LocalDate.of(2023, 9, 26),
                LocalTime.of(8, 25), "Esfoliação"));
        schedulingIn.add(new Scheduling(client2,
                LocalDate.of(2022, 12, 30),
                LocalTime.of(17, 15), "Drenagem"));
        schedulingIn.add(new Scheduling(client3,
                LocalDate.of(2023, 5, 12),
                LocalTime.of(12, 00), "Lipo-Aspiração"));
        schedulingIn.add(new Scheduling(client4,
                LocalDate.of(2023, 1, 5),
                LocalTime.of(14, 38), "Massagem"));


        mostrarAgendamento(schedulingIn);
    }
        public static void mostrarAgendamento(List<Scheduling> schedulingIn) {
            System.out.println("-----------------AGENDAMENTOS ESTÉTICA REJUVENESCENCE--------------------");
            for (Scheduling agenda: schedulingIn) {
                System.out.println(agenda);




            }
        }
    }
