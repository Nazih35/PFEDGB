package org.dgb.archive.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.dgb.archive.entities.Utilisateur;
import org.dgb.archive.metier.IAdminMetier;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ManagedBean(name="userMB")
@RequestScoped

@RequestMapping(value="/admin")
public class adminController {
    
	@ManagedProperty(value="#{ArchiveMetierImpl}")
	@Autowired
	private IAdminMetier metier;
	
	 
     public IAdminMetier getMetier() {
		return metier;
	}

	public void setMetier(IAdminMetier metier) {
		this.metier = metier;
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

	private String nom;
     private String prenom;
	@RequestMapping(value="/inscrire")
	public String inscrire(Model model){
		
		model.addAttribute("user", new Utilisateur());
		return "inscrire";
	}
	
	@RequestMapping(value="/saveUser")
public String saveUser(@Valid @ModelAttribute("user") Utilisateur u,BindingResult bindingResult,Model model){
		if(bindingResult.hasErrors()) {
			return "inscrire";
		}
		
		metier.ajouterUtilisateur(u);
		model.addAttribute("user", new Utilisateur());
		return "inscrire";
	}

	
	}	

