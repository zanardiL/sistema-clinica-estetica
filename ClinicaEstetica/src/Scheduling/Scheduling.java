package Scheduling;

import java.time.LocalDate;
import java.time.LocalTime;

public class Scheduling {

    private String name;
    private LocalTime schedule;
    private LocalDate date;
    private String procedure;

    public Scheduling(String name, LocalTime schedule, LocalDate date, String procedure) {
        this.name = name;
        this.schedule = schedule;
        this.date = date;
        this.procedure = procedure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getSchedule() {
        return schedule;
    }

    public void setSchedule(LocalTime schedule) {
        this.schedule = schedule;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    @Override
    public String toString() {
        return "Scheduling{" +
                "name='" + name + '\'' +
                ", schedule=" + schedule +
                ", date=" + date +
                ", procedure='" + procedure + '\'' +
                '}';
    }
}
