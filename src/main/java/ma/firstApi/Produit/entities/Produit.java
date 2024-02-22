package ma.firstApi.Produit.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Produit  implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idProduit")
    private long idP;

    @Column(name = "nom")
    private String nom;

    @Column(name = "Description")
    private String Description;

    @Column(name = "prix")
    private double prix;

    public Produit( String nom, String description, double prix, double stock) {

        this.nom = nom;
        Description = description;
        this.prix = prix;
        this.stock = stock;
    }

    @Column(name = "stock")
    private double stock;
    @ManyToOne
    private Categorie categorie;
    @ManyToOne
    private Fournisseur fournisseur;
}
