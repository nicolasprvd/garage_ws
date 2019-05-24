package services;

import models.Employe;
/**
 * Classe EmployeException
 * G�re une exception sur un employ�
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
		return "L'employ� " + employe + " est deja existant. Nous ne pouvons donc pas rajouter l'employ� dans la liste." ;
	}

}
