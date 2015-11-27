package BoutiqueECommerce.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by BOKSIC on 20/11/2015.
 */
@XmlRootElement
public class Client
{
    private long id;
    private String profileName;
    private String prenom;
    private String nom;
    private String adress;
    private String pays;

    public Client(long id, String profileName, String prenom, String nom, String adress, String pays)
    {
        this.id = id;
        this.profileName = profileName;
        this.prenom = prenom;
        this.nom = nom;
        this.adress = adress;
        this.pays = pays;
    }

    public Client()
    {

    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getProfileName()
    {
        return profileName;
    }

    public void setProfileName(String profileName)
    {
        this.profileName = profileName;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getAdress()
    {
        return adress;
    }

    public void setAdress(String adress)
    {
        this.adress = adress;
    }

    public String getPays()
    {
        return pays;
    }

    public void setPays(String pays)
    {
        this.pays = pays;
    }
}
