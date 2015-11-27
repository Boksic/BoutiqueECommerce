package BoutiqueECommerce.service;

import BoutiqueECommerce.database.DatabaseClass;
import BoutiqueECommerce.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by BOKSIC on 20/11/2015.
 */
public class ClientService
{
    private Map<Long, Client> clients = DatabaseClass.getClients();

    public ClientService()
    {
        Client john = new Client(1, "John1", "John", "Doe", "AAA", "France");

        clients.put((long) 1, john);
    }

    public List<Client> getAllClient()
    {
        return new ArrayList<Client>(clients.values());
    }

    public Client getClientById(Long id)
    {
        return clients.get(id);
    }

    public Client addClient(Client client)
    {
        long id = clients.size() + 1;

        client.setId(id);
        clients.put(id, client);

        return client;
    }

    public Client modifyClient(long id, Client client)
    {
        client.setId(id);
        clients.replace(id, client);

        return client;
    }

    public Client removeClient(long id)
    {
        return clients.remove(id);
    }
}
