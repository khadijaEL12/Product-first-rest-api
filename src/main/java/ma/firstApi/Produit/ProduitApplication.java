package ma.firstApi.Produit;

import ma.firstApi.Produit.entities.Categorie;
import ma.firstApi.Produit.entities.Fournisseur;
import ma.firstApi.Produit.entities.Produit;
import ma.firstApi.Produit.repo.ICategorieRepo;
import ma.firstApi.Produit.repo.IFournisseurRepo;
import ma.firstApi.Produit.repo.IProduitRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProduitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProduitApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(IProduitRepo iProduitRepo, ICategorieRepo iCategorieRepo, IFournisseurRepo iFournisseurRepo){
		return  args -> {
			iProduitRepo.save(
					new Produit("pc","nice",12000,100000)
					);
			iProduitRepo.save(
					new Produit("pc","nice",12000,100000)
			);
			iProduitRepo.save(
					new Produit("pc","nice",12000,100000)
			);
			iProduitRepo.save(
					new Produit("pc","nice",12000,100000)
			);
			iProduitRepo.save(
					new Produit("pc","nice",12000,100000)
			);
			iProduitRepo.save(
					new Produit("pc","nice",12000,100000)
			);
			iProduitRepo.save(
					new Produit("pc","nice",12000,100000)
			);
			iProduitRepo.save(
					new Produit("pc","nice",12000,100000)
			);
			iProduitRepo.save(
					new Produit("pc","nice",12000,100000)
			);
			iCategorieRepo.save(
					new Categorie("tech")
			);
			iCategorieRepo.save(
					new Categorie("tech")
			);
			iCategorieRepo.save(
					new Categorie("tech")
			);
			iCategorieRepo.save(
					new Categorie("tech")
			);
			iCategorieRepo.save(
					new Categorie("tech")
			);
			iCategorieRepo.save(
					new Categorie("tech")
			);
			iCategorieRepo.save(
					new Categorie("tech")
			);


			iFournisseurRepo.save(
					new Fournisseur("mouad")
			);
			iFournisseurRepo.save(
					new Fournisseur("mouad")
			);
			iFournisseurRepo.save(
					new Fournisseur("mouad")
			);
			iFournisseurRepo.save(
					new Fournisseur("mouad")
			);
			iFournisseurRepo.save(
					new Fournisseur("mouad")
			);
			iFournisseurRepo.save(
					new Fournisseur("mouad")
			);
			iFournisseurRepo.save(
					new Fournisseur("mouad")
			);
			iFournisseurRepo.save(
					new Fournisseur("mouad")
			);
			iFournisseurRepo.save(
					new Fournisseur("mouad")
			);
			iFournisseurRepo.save(
					new Fournisseur("mouad")
			);
		};

	}
}
