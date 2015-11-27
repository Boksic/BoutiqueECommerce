package BoutiqueECommerce.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by BOKSIC on 20/11/2015.
 */
@XmlRootElement
public class Commande
{
    private long id;
    private float total;
    private Date date = new Date();;
    private String client;
    private Map<Long, LigneDeCommande> lignesdecommande = new ConcurrentHashMap<>();

    public Commande(long id, String client)
    {
        this.id = id;
        this.total = 0;
        this.client = client;
    }

    public Commande()
    {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Map<Long, LigneDeCommande> getLignesDeCommande() {
        return lignesdecommande;
    }

    public void setLignesDeCommande(Map<Long, LigneDeCommande> lignesDeCommande) {
        this.lignesdecommande = lignesDeCommande;
    }
}
