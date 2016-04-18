package org.dgb.archive.metier;

import java.util.List;

import org.dgb.archive.entities.Role;
import org.dgb.archive.entities.Utilisateur;

public interface IAdminMetier extends IArchivistMetier{
   
	public Utilisateur ajouterUtilisateur(Utilisateur u);
  
    public Utilisateur rechUtilisateur(long idUser);
	
	public List<Utilisateur> rechUtilisateurParUsername(String username);
	
	public List<Utilisateur> UtilisateurParUsername(String username);

	public List<Utilisateur> rechUtilisateurParEmail(String email);
	
	public List<Utilisateur> getListUsers();
 
	public void supprimerUtilisateur(long idUser);
	
    public Role ajouterRole(Role r);
	
	public void attribuerUserRole(long idUser,long idRole);
	
	public List<Utilisateur> listUsersParRole(String nomRole);
	
	public List<Utilisateur> listUsersParRole(long idRole);
	
	public List<Role> getListRole();
	
	public List<Role> listRoleUser(String username);

	public List<Role> listRoleUser(long idUser);


}
