package org.dgb.archive.model;

import org.dgb.archive.entities.Utilisateur;

public class userForm {
  private Utilisateur u;
  private String nom;

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public Utilisateur getU() {
	return u;
}

public void setU(Utilisateur u) {
	this.u = u;
}
}
