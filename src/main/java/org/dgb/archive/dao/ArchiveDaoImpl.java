package org.dgb.archive.dao;

import org.dgb.archive.entities.Role;
import org.dgb.archive.entities.Utilisateur;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

import javax.persistence.*;


public class ArchiveDaoImpl implements IArchiveDao {
	@PersistenceContext()
	 private EntityManager em;
	
	public String getHashPassword(String password) {  
		  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();  
		  String hashedPassword = passwordEncoder.encode(password);  
		  
		  return hashedPassword;  
		  }
	 
	
	@Override
	public Utilisateur ajouterUtilisateur(Utilisateur u) {
	    u.setMotdepasse(getHashPassword(u.getMotdepasse()));

	    em.persist(u);
		return u;
	}

	@Override
	public Utilisateur rechUtilisateur(long idUser) {
		Utilisateur u = em.find(Utilisateur.class, idUser);
		if (u==null) throw new RuntimeException("L'utilisateur n'existe pas");
		return u;
	}

	@Override
	public List<Utilisateur> rechUtilisateurParUsername(String username) {
     Query req = em.createQuery("select u from Utilisateur u where u.username like :x");
     req.setParameter("x","%"+username+"%");
     return req.getResultList();
	}

	@Override
	public List<Utilisateur> rechUtilisateurParEmail(String email) {
		 Query req = em.createQuery("select u from Utilisateur u where u.email like :x");
	     req.setParameter("x","%"+email+"%");
	     return req.getResultList();
	}
	public List<Utilisateur> getListUsers(){
		Query req = em.createQuery("select u from Utilisateur u");
	     return req.getResultList();
	}

	@Override
	public void supprimerUtilisateur(long idUser) {
		// TODO Auto-generated method stub
		Utilisateur u = em.find(Utilisateur.class, idUser);
		if (u==null) throw new RuntimeException("L'utilisateur n'existe pas");
		else em.remove(u);
		
	}
	
	public List<Utilisateur> listUsersParRole(String nomRole){
		
		Query req = em.createQuery("SELECT u FROM Utilisateur u JOIN u.roles r WHERE r.nomRole like :x");
		 req.setParameter("x","%"+nomRole+"%");
	     return req.getResultList();
		
	}

	

	@Override
	public Role ajouterRole(Role r) {
		em.persist(r);
		return r;
	}

	@Override
	public void attribuerUserRole(long idUser, long idRole) {
         Utilisateur u = em.find(Utilisateur.class,idUser );
         if (u==null) throw new RuntimeException("L'utilisateur n'existe pas");
         Role r = em.find(Role.class, idRole);
         if (r==null) throw new RuntimeException("Le role n'existe pas");
         u.getRoles().add(r);
         r.getUsers().add(u);
	}

	@Override
	public List<Role> getListRole() {
		Query req = em.createQuery("select r from Role r");
	     return req.getResultList();
	}

	@Override
	public List<Utilisateur> listUsersParRole(long idRole) {
		Query req = em.createQuery("SELECT u FROM Utilisateur u JOIN u.roles r WHERE r.idRole = :x");
		 req.setParameter("x",idRole);
	     return req.getResultList();
	}

	@Override
	public List<Role> listRoleUser(String username) {
		// TODO Auto-generated method stub
		
		Query req = em.createQuery("SELECT r FROM Role r JOIN r.users u WHERE u.username like :x");
		 req.setParameter("x","%"+username+"%");
	     return req.getResultList();
	}

	@Override
	public List<Role> listRoleUser(long idUser) {

		Query req = em.createQuery("SELECT r FROM Role r JOIN r.users u WHERE u.idUser = :x");
		 req.setParameter("x",idUser);
	     return req.getResultList();
	}


	@Override
	public List<Utilisateur> UtilisateurParUsername(String username) {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select u from Utilisateur u where u.username = :x");
	     req.setParameter("x",username);
	     return req.getResultList();
		
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

	
	

}
