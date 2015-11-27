package BoutiqueECommerce.service;

import BoutiqueECommerce.database.DatabaseClass;
import BoutiqueECommerce.model.Commande;
import BoutiqueECommerce.model.LigneDeCommande;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by BOKSIC on 20/11/2015.
 */
public class LigneDeCommandeService
{
    private Map<Long, Commande> commandeMap = DatabaseClass.getCommande();

    public List<LigneDeCommande> getAllLigneDeCommande(long commandeId)
    {
        Map<Long, LigneDeCommande> ligneDeCommandes = commandeMap.get(commandeId).getLignesDeCommande();
        return new ArrayList<LigneDeCommande>(ligneDeCommandes.values());
    }

    public LigneDeCommande getLigneDeCommandeById(long commandeId, long ligneDeCommandeId)
    {
        Commande commande = commandeMap.get(commandeId);

        Map<Long, LigneDeCommande> ligneDeCommandes = commande.getLignesDeCommande();

        LigneDeCommande ligneDeCommande = ligneDeCommandes.get(ligneDeCommandeId);

        return ligneDeCommande;
    }

    public LigneDeCommande addLigneDeCommande(long commandeId, LigneDeCommande ligneDeCommande)
    {
        Commande commande = commandeMap.get(commandeId);

        Map<Long, LigneDeCommande> ligneDeCommandes = commande.getLignesDeCommande();

        ligneDeCommande.setId(ligneDeCommandes.size() + 1);
        ligneDeCommandes.put(ligneDeCommande.getId(), ligneDeCommande);

        commande.setTotal(commande.getTotal() + (ligneDeCommande.getQuantite() * ligneDeCommande.getPrixUnitaire()));

        return ligneDeCommande;
    }

    public LigneDeCommande modifyLigneDeCommande(long commandeId, LigneDeCommande ligneDeCommandeToSet)
    {
        if (ligneDeCommandeToSet.getId() <= 0)
        {
            return null;
        }

        Commande commande = commandeMap.get(commandeId);
        Map<Long, LigneDeCommande> ligneDeCommandes = commande.getLignesDeCommande();

        LigneDeCommande ligneDeCommandeToRemove = ligneDeCommandes.get(ligneDeCommandeToSet.getId());

        commande.setTotal(commande.getTotal() - (ligneDeCommandeToRemove.getPrixUnitaire() * ligneDeCommandeToRemove.getQuantite()));

        ligneDeCommandes.put(ligneDeCommandeToSet.getId(), ligneDeCommandeToSet);

        commande.setTotal(commande.getTotal() + (ligneDeCommandeToSet.getQuantite() * ligneDeCommandeToSet.getPrixUnitaire()));

        return ligneDeCommandeToSet;
    }

    public LigneDeCommande removeLigneDeCommande(long commandeId, long ligneDeCommandeId)
    {
        Commande commande = commandeMap.get(commandeId);

        Map<Long, LigneDeCommande> ligneDeCommandes = commande.getLignesDeCommande();
        LigneDeCommande ligneDeCommande = ligneDeCommandes.get(ligneDeCommandeId);

        commande.setTotal(commande.getTotal() - (ligneDeCommande.getPrixUnitaire() * ligneDeCommande.getQuantite()));

        return ligneDeCommandes.remove(ligneDeCommandeId);
    }
}
