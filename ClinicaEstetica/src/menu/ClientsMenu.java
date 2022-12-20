package menu;

import application.ExitApp;
import business.object.client.Address;
import business.object.client.Client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ClientsMenu {
    public static Scanner sc = new Scanner(System.in);
        public int getClientsMenuOption() {
            Integer opt = null;
            do {
                do {
                    try {
                        System.out.println("\n\n-> Selecione a opção:");
                        System.out.println("\t1 - Novo cliente ");
                        System.out.println("\t2 - Deletar cliente ");
                        System.out.println("\t3 - Imprimir lista de clientes (.csv)");

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
                } while(opt==null);
            } while (opt != 1 && opt!= 2 && opt!=3 && opt!=9);
            return opt;
        }

        public void setOption(int opt, List<Client> clientList) {
            switch (opt) {
                case 1:
                    System.out.println("-> Cadastro de cliente");
                    try {
                        System.out.println("Digite o nome da(o) cliente: ");
                        String nomeInput = sc.next();

                        System.out.println("Digite o endereço da(o) " + nomeInput +": ");
                        System.out.println("Rua: ");
                        String ruaInput = sc.next();

                        System.out.println("Número: ");
                        String numInput = sc.next();

                        System.out.println("Bairro: ");
                        String bairroInput = sc.next();

                        System.out.println("CEP: ");
                        String cepInput = sc.next();

                        System.out.println("Estado: ");
                        String estadoInput = sc.next();

                        System.out.println("Telefone: ");
                        String telInput = sc.next();

                        System.out.println("Email: ");
                        String emailInput = sc.next();


                        clientList.add(new Client(
                                Integer.toString(clientList.size()),
                                nomeInput,
                                new Address(
                                        ruaInput,
                                        numInput,
                                        cepInput,
                                        bairroInput,
                                        estadoInput
                                ),
                                telInput,
                                emailInput
                                ));

                    } catch (InputMismatchException e) {
                        System.err.println("Por favor, insira um valor válido");
                    }  catch (IllegalStateException e2) {
                        System.err.println(e2);
                    } catch (NoSuchElementException e3) {
                        System.err.println(e3);
                    }
                    break;
                case 2:
                    boolean isDeleted = false;
                    do {
                        try {
                            System.out.println("-> Deletar cliente");
                            System.out.println("Insira o ID do cliente: ");
                            String idInput = sc.next();

                            if (clientList.contains(idInput)) {
                                for (int i = 0; i < clientList.size(); i++) {
                                    Client c = clientList.get(i);
                                    if (c.getId().equals(idInput)) {
                                        clientList.remove(c);
                                        isDeleted = true;
                                    }
                                }
                            } else {
                                System.out.println("ID não identificado");
                            }
                        } catch (InputMismatchException e) {
                            System.err.println("Por favor, insira um valor válido");
                        }
                    } while (!isDeleted);
                    break;
                case 3:
                    System.out.println("-> Imprimir arquivo de clientes (.csv)");
                    File csvFile = new File("C:\\Users\\zanar\\Documents\\GitHub\\sistema-clinica-estetica\\ClinicaEstetica\\src\\files");
                    try (PrintWriter csvWriter = new PrintWriter(new FileWriter(csvFile));){
                        for(Client client : clientList){
                            csvWriter.println(client);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 9:
                    new ExitApp().exitApp();
            }
        }
    }