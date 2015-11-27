package BoutiqueECommerce.resources;

import BoutiqueECommerce.model.LigneDeCommande;
import BoutiqueECommerce.service.LigneDeCommandeService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by BOKSIC on 20/11/2015.
 */
@Path("/")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class LigneDeCommandeResource
{
    public LigneDeCommandeService ligneDeCommandeService = new LigneDeCommandeService();

    @GET
    public List<LigneDeCommande> getAllLignesDeCommande(@PathParam("commandeId") long commandeId)
    {
        return ligneDeCommandeService.getAllLigneDeCommande(commandeId);
    }

    @GET
    @Path("/{ligneDeCommandeId}")
    public LigneDeCommande getLigneDeCommandeById(@PathParam("commandeId") long commandeID, @PathParam("ligneDeCommandeId") long ligneDeCommandeId)
    {
        return ligneDeCommandeService.getLigneDeCommandeById(commandeID, ligneDeCommandeId);
    }

    @POST
    public LigneDeCommande addLigneDeCommande(@PathParam("commandeId") long commandeId, LigneDeCommande ligneDeCommande)
    {
        return ligneDeCommandeService.addLigneDeCommande(commandeId, ligneDeCommande);
    }

    @PUT
    @Path("/{ligneDeCommandeId}")
    public LigneDeCommande modifyLigneDeCommande(@PathParam("commandeId") long commandeId, @PathParam("ligneDeCommandeId") long ligneDeCommandeId, LigneDeCommande ligneDeCommande)
    {
        ligneDeCommande.setId(ligneDeCommandeId);
        return ligneDeCommandeService.modifyLigneDeCommande(commandeId, ligneDeCommande);
    }

    @DELETE
    @Path("/{ligneDeCommandeId}")
    public void deleteLigneDeCommande(@PathParam("commandeId") long commandeId, @PathParam("ligneDeCommandeId") long ligneDeCommandeId)
    {
        ligneDeCommandeService.removeLigneDeCommande(commandeId, ligneDeCommandeId);
    }
}
