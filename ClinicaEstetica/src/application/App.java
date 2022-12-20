package application;

import business.object.client.Client;
import menu.*;
import login.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<Client> clientList = new ArrayList<Client>();
    public static void main(String[] args) {
        new Initialize().initialize();
//        Login usuario1 = new Login("Lais", "12ab");
//        usuario1.authenticate();

        //Por ser a primeira inicialização precisamos primeiro cadastrar os novos clientes.
        if(clientList.isEmpty()) {
            ClientsMenu clientsMenu = new ClientsMenu();
            int opt = clientsMenu.getClientsMenuOption();
            clientsMenu.setOption(opt, clientList);
        }



    }
}
