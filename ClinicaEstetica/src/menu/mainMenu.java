package menu;

import application.ExitApp;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static application.App.clientList;

public class mainMenu {

    public int getOption() {
        Scanner sc = new Scanner(System.in);
        Integer opt = null;
        do {
            do {
                try {
                    System.out.println("\n-> Selecione a opção desejada: ");
                    System.out.println("\t1 - Agendamento ");
                    System.out.println("\t2 - Vendas ");
                    System.out.println("\t3 - Clientes ");
                    System.out.println("\t9 - Sair ");

                    opt = sc.nextInt();

                } catch (InputMismatchException e) {
                    System.err.println("Por favor, digite uma opção válida");
                    System.err.println(e);
                } catch (IllegalStateException e2) {
                    System.err.println(e2);
                } catch (NoSuchElementException e3) {
                    System.err.println(e3);
                }
            } while(opt==null);
        } while (opt != 1 && opt!= 2 && opt!=3 && opt!=9);
        return opt;
    }

    public void setOption(int option) {
        switch (option) {
            case 1:
                SchedulingMenu schedulingMenu = new SchedulingMenu();
                int opt = schedulingMenu.getSchedulingMenuOptions();
                break;
            case 2:
                System.out.println("VENDAS");
                break;
            case 3:
                ClientsMenu clientsMenu = new ClientsMenu();
                opt = clientsMenu.getClientsMenuOption();
                clientsMenu.setOption(opt, clientList);
                break;
            case 9:
                new ExitApp().exitApp();
        }

    }
}


