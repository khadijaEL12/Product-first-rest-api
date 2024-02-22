package ma.firstApi.Produit.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Fournisseur implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    public Fournisseur(String nom) {
        this.nom = nom;
    }

    @OneToMany(mappedBy = "fournisseur")
    private Collection <Produit> produits;
}
