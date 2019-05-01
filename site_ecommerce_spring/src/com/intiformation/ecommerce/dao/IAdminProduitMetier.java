package com.intiformation.ecommerce.dao;

import com.intiformation.ecommerce.entity.Produit;

public interface IAdminProduitMetier {

	public Long ajouterProduit(Produit p, Long idCat);

	public void supprimerProduit(Long idP);

	public void modifierProduit(Produit p);
}
