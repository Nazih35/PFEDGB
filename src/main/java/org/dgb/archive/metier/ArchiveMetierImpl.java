package org.dgb.archive.metier;

import java.util.List;

import org.dgb.archive.dao.IArchiveDao;
import org.dgb.archive.entities.Role;
import org.dgb.archive.entities.Utilisateur;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ArchiveMetierImpl implements IAdminMetier {
    
	private IArchiveDao dao;
	public Utilisateur ajouterUtilisateur(Utilisateur u) {
		// TODO Auto-generated method stub
		return dao.ajouterUtilisateur(u);
	}
	
	public void setDao(IArchiveDao dao) {
		this.dao = dao;
	}

	@Override
	public Utilisateur rechUtilisateur(long idUser) {
		// TODO Auto-generated method stub
		return dao.rechUtilisateur(idUser);
	}

	@Override
	public List<Utilisateur> rechUtilisateurParUsername(String username) {
		// TODO Auto-generated method stub
		return dao.rechUtilisateurParUsername(username);
	}

	@Override
	public List<Utilisateur> rechUtilisateurParEmail(String email) {
		// TODO Auto-generated method stub
		return dao.rechUtilisateurParEmail(email);
	}

	@Override
	public List<Utilisateur> getListUsers() {
		// TODO Auto-generated method stub
		return dao.getListUsers();
	}
	
	public void supprimerUtilisateur(long idUser){
		dao.supprimerUtilisateur(idUser);
	}

	@Override
	public Role ajouterRole(Role r) {
		// TODO Auto-generated method stub
		return dao.ajouterRole(r);
	}

	@Override
	public void attribuerUserRole(long idUser, long idRole) {
		// TODO Auto-generated method stub
		dao.attribuerUserRole(idUser, idRole);
		
	}

	@Override
	public List<Utilisateur> listUsersParRole(String nomRole) {
		// TODO Auto-generated method stub
		return dao.listUsersParRole(nomRole);
	}

	@Override
	public List<Role> getListRole() {
		// TODO Auto-generated method stub
		return dao.getListRole();
	}

	@Override
	public List<Utilisateur> listUsersParRole(long idRole) {
		// TODO Auto-generated method stub
		return dao.listUsersParRole(idRole);
	}

	@Override
	public List<Role> listRoleUser(String username) {
		// TODO Auto-generated method stub
		return dao.listRoleUser(username);
	}

	@Override
	public List<Role> listRoleUser(long idUser) {
		// TODO Auto-generated method stub
		return dao.listRoleUser(idUser);
	}

	@Override
	public List<Utilisateur> UtilisateurParUsername(String username) {
		// TODO Auto-generated method stub
		return dao.UtilisateurParUsername(username);
	}


	

}
