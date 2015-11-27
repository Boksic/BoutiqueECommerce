package BoutiqueECommerce.resources;

import BoutiqueECommerce.model.Commande;
import BoutiqueECommerce.service.CommandeService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by BOKSIC on 20/11/2015.
 */
@Path("commandes")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class CommandeResource
{
    public CommandeService commandeService = new CommandeService();

    @GET
    public List<Commande> listCommande()
    {
        return commandeService.getAllCommande();
    }

    @GET
    @Path("{id}")
    public Commande getCommandeById(@PathParam("id") Long id)
    {
        return commandeService.getCommandeById(id);
    }

    @POST
    public Commande addCommande(Commande commande)
    {
        return commandeService.addCommande(commande);
    }

    @PUT
    @Path("{id}")
    public Commande modifyCommande(@PathParam("id") long id, Commande commande)
    {
        return commandeService.modifyCommande(id, commande);
    }

    @DELETE
    @Path("{id}")
    public void deleteCommande(@PathParam("id") long id)
    {
        commandeService.removeCommande(id);
    }

    @Path("{commandeId}/lignesdecommande")
    public LigneDeCommandeResource getLigneDeCommandeResource()
    {
        return new LigneDeCommandeResource();
    }
}
