package org.dgb.archive.annotation;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.dgb.archive.dao.IArchiveDao;
import org.dgb.archive.entities.Utilisateur;
import org.dgb.archive.metier.IAdminMetier;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername,String >{

	@Autowired
	private IAdminMetier metier;

	public void initialize(UniqueUsername arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		List<Utilisateur> user = metier.UtilisateurParUsername(username);
		
		return user.isEmpty();
	}

}
