package services;

import models.Employe;
/**
 * Classe EmployeException
 * Gère une exception sur un employé
 * @author NicolasP
 *
 */
public class EmployeException extends Exception {
	
private Employe employe;
	
	public EmployeException(Employe e) {
		this.employe = e;
	}
	
	public Employe retour() {
		return employe;
	}
	
	public String getMessage() {
		return "L'employé " + employe + " est deja existant. Nous ne pouvons donc pas rajouter l'employé dans la liste." ;
	}

}
