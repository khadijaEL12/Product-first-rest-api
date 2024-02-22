package ma.firstApi.Produit.service;

import lombok.AllArgsConstructor;
import ma.firstApi.Produit.entities.Produit;
import ma.firstApi.Produit.repo.IProduitRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProduitService {
    IProduitRepo iProduitRepo;

    public Produit createProduit(Produit produit){
        return iProduitRepo.save(produit);
    }

    public List<Produit> getProduits(){
        return  iProduitRepo.findAll();
    }

    public Optional<Produit> getProduit(Long id){
        return  iProduitRepo.findById(id);
    }

    public  void deleteProduit(Long prodId){
        iProduitRepo.deleteById(prodId);
    }

    public Produit updateProduit(Long prodId,Produit produit){
         Produit produit1=iProduitRepo.findById(prodId).get();
         produit1.setNom(produit.getNom());
         produit1.setDescription(produit.getDescription());
         produit1.setPrix(produit.getPrix());
         produit1.setStock(produit.getStock());

         return iProduitRepo.save(produit1) ;
    }


}
