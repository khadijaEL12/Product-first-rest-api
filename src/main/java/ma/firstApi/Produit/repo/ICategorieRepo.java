package ma.firstApi.Produit.repo;

import ma.firstApi.Produit.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategorieRepo extends JpaRepository<Categorie,Long> {
}
