package ma.firstApi.Produit.controller;

import lombok.AllArgsConstructor;
import ma.firstApi.Produit.entities.Produit;
import ma.firstApi.Produit.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProduitController {
       @Autowired
       ProduitService produitService;

       @GetMapping("/{id}")
       public ResponseEntity<Produit> getProductById(@PathVariable Long id) {
              Optional<Produit> productOptional = produitService.getProduit(id);
              if (productOptional.isPresent()) {
                     return ResponseEntity.ok(productOptional.get());
              } else {
                     return ResponseEntity.notFound().build();
              }
       }

       @GetMapping("/Produit")
       public ResponseEntity<List<Produit>> getProducts() {
              List<Produit> productList = produitService.getProduits();
              if (!productList.isEmpty()) {
                     return ResponseEntity.ok(productList);
              } else {
                     return ResponseEntity.notFound().build();
              }
       }

}
