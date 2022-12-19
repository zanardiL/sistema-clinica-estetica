package Scheduling;

import java.time.LocalDate;


public class Scheduling {

    private String name;
    private LocalDate date = LocalDate.parse("YYYY-MM-DD");
    private String procedure;

    public Scheduling(String name,  LocalDate date, String procedure) {
        this.name = name;

        this.date = date;
        this.procedure = procedure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

                ", date=" + date +
                ", procedure='" + procedure + '\'' +
                '}';
    }
}
