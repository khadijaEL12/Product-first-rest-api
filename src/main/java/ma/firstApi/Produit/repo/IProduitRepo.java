package ma.firstApi.Produit.repo;

import ma.firstApi.Produit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduitRepo extends JpaRepository<Produit,Long> {

    public Produit findByNom(String nom);
}
