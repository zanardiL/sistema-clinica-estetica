package Scheduling;

import java.time.LocalDate;


public class Scheduling {

    private String name;
    private LocalDate date ;
    private String procedure;

    public Scheduling(String name, int date, String procedure) {
        this.name = name;

        this.date = LocalDate.parse("yyyy,MM,dd");
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
