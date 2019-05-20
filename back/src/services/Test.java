package services;

import collections.Vehicules;
import models.Vehicule;
import models.VehiculeType;

public class Test {

	public static void main(String[] args) {
		
		GestionGarageServiceImpl g = new GestionGarageServiceImpl("D:/MIAGE/S8/WebServices/GarageWSBack/WebContent/WEB-INF/data/vehicules.xml");
		Vehicule v = new Vehicule("test", "peugeot", "noire", "208", "options", "diesel", 20000, 2000, 2019, VehiculeType.VOITURE, false, true);
		System.out.println(v.toString());
		Vehicules vehicules = new Vehicules();
		vehicules.getVehicules();
		vehicules.ajouterVehicule(v);
		System.out.println(vehicules.toString());
		g.ajouterVehicule(v);
		

	}

}
