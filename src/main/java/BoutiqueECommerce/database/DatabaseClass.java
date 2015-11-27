package BoutiqueECommerce.database;

import BoutiqueECommerce.model.Client;
import BoutiqueECommerce.model.Commande;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by BOKSIC on 20/11/2015.
 */
public class DatabaseClass
{
    private static Map<Long, Client> clients = new ConcurrentHashMap<>();

    private static Map<Long, Commande> commandeMap = new ConcurrentHashMap<>();

    public DatabaseClass()
    {

    }

    public static Map<Long, Client> getClients()
    {
        return clients;
    }

    public static Map<Long, Commande> getCommande()
    {
        return commandeMap;
    }
}
