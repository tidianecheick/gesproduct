package com.axel.gesproduit.ressource;


import com.axel.gesproduit.domaine.Produit;
import com.axel.gesproduit.service.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(value="v1/api/")
public class ProduitResource {

    private final ProduitService produitService;


    public ProduitResource(ProduitService produitService){
        this.produitService=produitService;
    }

    @GetMapping("produit")
    public List<Produit> getAllProduit(){
       return produitService.getAllProduit();
    }
    @GetMapping("produit{id}")
    public Optional<Produit> findById (@PathVariable Long id){
        return produitService.findById(id);

        }

        @DeleteMapping("produit{id}")
    public void deleteById( @PathVariable Long id){
        produitService.findById(id);
        }
        @PostMapping("produit")
    public Produit createProdtuit( @RequestBody Produit produit){
        return produitService.saveProduit(produit);
        }
        @PutMapping("produit")
    public Produit updateProduit(@PathVariable Long id, @RequestBody Produit produit){
        return produitService.saveProduit(produit);
        }

    }



