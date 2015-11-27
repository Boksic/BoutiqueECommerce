package BoutiqueECommerce.service;

import BoutiqueECommerce.database.DatabaseClass;
import BoutiqueECommerce.model.Commande;
import BoutiqueECommerce.model.LigneDeCommande;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by BOKSIC on 20/11/2015.
 */
public class CommandeService
{
    private Map<Long, Commande> commandeMap = DatabaseClass.getCommande();

    public CommandeService()
    {
        Commande commande = new Commande(1,"Boksic");

        commandeMap.put(commande.getId(),commande);
    }

    public List<Commande> getAllCommande()
    {
        return new ArrayList<>(commandeMap.values());
    }

    public Commande getCommandeById(Long id)
    {
        return commandeMap.get(id);
    }

    public Commande addCommande(Commande commande)
    {
        long id = commandeMap.size() + 1;

        commande.setId(id);
        commande.setLignesDeCommande(new ConcurrentHashMap<Long, LigneDeCommande>());
        commandeMap.put(id, commande);

        return commande;
    }

    public Commande modifyCommande(long id, Commande commande)
    {
        commande.setId(id);
        commandeMap.replace(id, commande);

        return commande;
    }

    public Commande removeCommande(long id)
    {
        return commandeMap.remove(id);
    }
}
