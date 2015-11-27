package BoutiqueECommerce.resources;

import BoutiqueECommerce.model.Client;
import BoutiqueECommerce.service.ClientService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by BOKSIC on 20/11/2015.
 */
@Path("clients")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class ClientResource
{
    ClientService clientService = new ClientService();

    @GET
    public List<Client> listClient()
    {
        return clientService.getAllClient();
    }

    @GET
    @Path("{id}")
    public Client getClientById(@PathParam("id") Long id)
    {
        return clientService.getClientById(id);
    }

    @POST
    public Client addClient(Client client)
    {
        return clientService.addClient(client);
    }

    @PUT
    @Path("{id}")
    public Client modifyClient(@PathParam("id") long id, Client client)
    {
        return clientService.modifyClient(id, client);
    }

    @DELETE
    @Path("{id}")
    public Client deleteClient(@PathParam("id") long id)
    {
        return clientService.removeClient(id);
    }
}
