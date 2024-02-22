package ma.firstApi.Produit.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Categorie  implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Categorie(String nom) {
        this.nom = nom;
    }

    private String nom;

    @OneToMany(mappedBy = "categorie",fetch= FetchType.LAZY)
    private Collection<Produit> produits;
}
