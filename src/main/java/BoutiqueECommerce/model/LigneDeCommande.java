package BoutiqueECommerce.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by BOKSIC on 20/11/2015.
 */
@XmlRootElement
public class LigneDeCommande
{
    private long id;
    private String article;
    private int quantite;
    private float prixUnitaire;

    public LigneDeCommande(long id, String article, int quantite, float prixUnitaire)
    {
        this.id = id;
        this.article = article;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }

    public LigneDeCommande()
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

    public String getArticle()
    {
        return article;
    }

    public void setArticle(String article)
    {
        this.article = article;
    }

    public int getQuantite()
    {
        return quantite;
    }

    public void setQuantite(int quantite)
    {
        this.quantite = quantite;
    }

    public float getPrixUnitaire()
    {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire)
    {
        this.prixUnitaire = prixUnitaire;
    }
}
