package Scheduling;

import builders.Client;

import java.time.LocalDate;
import java.time.LocalTime;


public class Scheduling {

    private Client client;
    private LocalDate date;
    private LocalTime horario;
    private String procedure;


    public Scheduling(Client client, LocalDate date, LocalTime horario, String procedure) {
        this.client = client;
        this.date = date;
        this.horario = horario;
        this.procedure = procedure;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    @Override
    public String toString() {
        return "\nScheduling{" +
                "\nclient=" + client +
                "\n, date=" + date +
                "\n, horario=" + horario +
                "\n, procedure='" + procedure + '\'' +
                '}';
    }
}