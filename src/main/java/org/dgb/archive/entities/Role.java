package org.dgb.archive.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Role")

public class Role {
	 @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="ID_Role")
	private long idRole;
	private String nomRole;
	
	@ManyToMany(mappedBy="roles")
	private Collection<Utilisateur> users;
	
	public long getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public String getNomRole() {
		return nomRole;
	}
	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}
	public Collection<Utilisateur> getUsers() {
		return users;
	}
	public void setUsers(List<Utilisateur> users) {
		this.users = users;
	}
	public Role(String nomRole) {
		super();
		this.nomRole = nomRole;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

}
