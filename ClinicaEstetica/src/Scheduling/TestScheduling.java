package Scheduling;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestScheduling {

    public static void main(String[] args) {



        List<Scheduling> scheduling = new ArrayList<>();
        scheduling.add(new Scheduling("Caterine",23-2-15,"Esfoliação"));
        scheduling.add(new Scheduling("Julia",3-1-2023,"LIpoescultura"));
        scheduling.add(new Scheduling ("Laís", 26-9-2023,"Drenagem Linfática"));


        System.out.println(scheduling);
        Date hoje = new Date();
        System.out.println(hoje);
    }
}
