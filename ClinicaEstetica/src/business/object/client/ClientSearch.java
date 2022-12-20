package business.object.client;

import search.Search;

import java.util.List;

public class ClientSearch {

    public boolean searchList(List<Client> clientList, Client client) {
        if(clientList.contains(client.getId()))
            return true;
        else
            return false;
    }
}
