package services;

import models.Vehicule;

/**
 * Classe VehiculeException
 * Gère une exception sur un véhicule
 * @author Nicolas - Audrey - Maroua
 *
 */
public class VehiculeException extends Exception {

	private Vehicule vehicule;
	
	public VehiculeException(Vehicule v) {
		this.vehicule = v;
	}
	
	public Vehicule retour() {
		return vehicule;
	}
	
	public String getMessage() {
		return "L'immatriculation du vehicule " + vehicule + " est deja existante. Nous ne pouvons donc pas rajouter le vehicule dans la liste." ;
	}
}
