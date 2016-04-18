package org.dgb.archive.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
 

@Entity
@Table(name="Utilisateur")


public class Utilisateur implements Serializable {
       @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
       @Column(name="ID_USER")
       
	   private long idUser;
       @NotEmpty
       private String nom;
       @NotEmpty
       private String prenom;
	   public Utilisateur(String nom, String prenom, String division, String direction, String sousdirection,
			int etage, char zone, String email, String username, String motdepasse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.division = division;
		this.direction = direction;
		this.sousdirection = sousdirection;
		this.etage = etage;
		this.zone = zone;
		this.email = email;
		this.username = username;
		this.motdepasse = motdepasse;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
    @NotEmpty
	private String division;
    @NotEmpty
	   private String direction;
    @NotEmpty
	   private String sousdirection;
	   private int etage;
	   private char zone;
	   @NotEmpty
	   @Column(unique = true)
       @Email
	   private String email;
	   @Size(min=4)
	   @NotEmpty
	   @Column(unique = true)
	   private String username;
	   @Size(min=6)
	   private String motdepasse;
	 
	   
	   @ManyToMany
	   @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "ID_USER"), inverseJoinColumns =
	   @JoinColumn(name = "ID_Role"))
	   private Collection<Role> roles;
	   
	
	
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getSousdirection() {
		return sousdirection;
	}
	public void setSousdirection(String sousdirection) {
		this.sousdirection = sousdirection;
	}
	public int getEtage() {
		return etage;
	}
	public void setEtage(int etage) {
		this.etage = etage;
	}
	public char getZone() {
		return zone;
	}
	public void setZone(char zone) {
		this.zone = zone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 

	   
	   
	
}
