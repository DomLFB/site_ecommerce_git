package com.intiformation.ecommerce.dao;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.entity.Role;
import com.intiformation.ecommerce.entity.User;

public interface IAdminCategoriesMetier {

	public Long ajouterCategorie(Categorie c);

	public void supprimerCategrorie(Long idcat);

	public void modifierCategorie(Categorie c);

	public void ajouterUser(User u);

	public void attribuerRole(Role r, Long userID);
}
