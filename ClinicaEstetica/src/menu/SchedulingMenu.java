package menu;

import application.ExitApp;
import business.object.client.Client;
import business.object.client.ClientSearch;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SchedulingMenu {
    public int getSchedulingMenuOptions() {
        Scanner sc = new Scanner(System.in);
        Integer opt = null;
        do {
            do {
                try {
                    System.out.println("\n-> Selecionado: Agendamento ");
                    System.out.println("\n\n-> Selecione a opção:");
                    System.out.println("\t1 - Novo agendamento ");
                    System.out.println("\t2 - Editar agendamento ");
                    System.out.println("\t3 - Excluir agendamento ");

                    System.out.println("\t9 - Sair ");

                    opt = sc.nextInt();

                } catch (InputMismatchException e) {
                    System.err.println("Por favor, digite uma opção válida");
                    sc.nextLine();
                } catch (IllegalStateException e2) {
                    sc.nextLine();
                } catch (NoSuchElementException e3) {
                    sc.nextLine();
                }
            } while (opt == null);
        } while (opt != 1 && opt != 2 && opt != 3 && opt != 9);
        sc.close();
        return opt;
    }

    private void setOption(int opt, ClientSearch clientSearch) {
        Scanner sc = new Scanner(System.in);
        switch (opt) {
            case 1:
                System.out.println("Digite o ID da(o) cliente: ");
//                String idInput = sc.next();
//                if (clientSearch.searchList()) {
//                    System.out.println("Digite a data desejada: ");
//                    if (dateTimeIsAvaiable) {
//                        scheduleList.add(scheduleProcedure);
//                    }
//                }

                break;
            case 2:
                System.out.println("VENDAS");
                break;
            case 3:
                System.out.println("CLIENTES");
                break;
            case 9:
                new ExitApp().exitApp();
        }

    }
}

