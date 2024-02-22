package ma.firstApi.Produit.repo;

import ma.firstApi.Produit.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFournisseurRepo extends JpaRepository<Fournisseur,Long> {
}
