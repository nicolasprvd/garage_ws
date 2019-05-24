package services;

import collections.Employes;
import collections.Vehicules;
import models.Employe;
import models.Vehicule;
import models.VehiculeType;

/**
 * Classe test des fonctionnalités développées
 * @author Nicolas - Audrey - Maroua
 *
 */
public class Test {

	public static void main(String[] args) {
		
		GestionGarageServiceImpl g = new GestionGarageServiceImpl();
		Vehicule v = new Vehicule("1", "Peugeot", "Noire", "208", "Radio, GPS, Régulateur", "Diesel", 20000, 2500, 2019, VehiculeType.VOITURE, false, true);
		Vehicule v2 = new Vehicule("2", "Peugeot", "Grise", "206", "Radio, GPS, Régulateur", "Essence", 20000, 2500, 2019, VehiculeType.VOITURE, false, true);
		Vehicule v3 = new Vehicule("3", "Peugeot", "Rouge", "3008", "Radio, GPS, Régulateur", "Diesel", 20000, 2500, 2019, VehiculeType.VOITURE, false, true);
		
		Employe e = new Employe(1, "Preveraud", "Nicolas", "Concessionnaire", "0606060606", "nicolas.preveraud@gmail.com", "nicolas");
		Employe e2 = new Employe(2, "Balat", "Audrey", "Concessionnaire", "0602272596", "audrey.balat028@gmail.com", "audrey");
		Employe e3 = new Employe(3, "Essaid", "Maroua", "Concessionnaire", "0658307642", "maroua.essaid@gmail.com", "maroua");
		
		Vehicules vehicules = new Vehicules();
		vehicules.getVehicules();
		vehicules.ajouterVehicule(v);
		vehicules.ajouterVehicule(v2);
		vehicules.ajouterVehicule(v3);
		System.out.println(vehicules.toString());
		try {
			g.ajouterVehicule(v);
			g.ajouterVehicule(v2);
			g.ajouterVehicule(v3);
		} catch (VehiculeException ve) {
			// TODO Auto-generated catch block
			ve.printStackTrace();
		}
		
		Employes employes = new Employes();
		employes.getEmployes();
		employes.ajouterEmploye(e);
		employes.ajouterEmploye(e2);
		employes.ajouterEmploye(e3);
		System.out.println(employes.toString());
		try {
			g.ajouterEmploye(e);
			g.ajouterEmploye(e2);
			g.ajouterEmploye(e3);
		} catch (EmployeException ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
		}
		
		
		

	}

}
