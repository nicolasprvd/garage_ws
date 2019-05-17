package services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import models.Employe;
import models.Vehicule;
import models.VehiculeType;

@WebService(endpointInterface = "services.GestionGarageService")
public class GestionGarageServiceImpl implements GestionGarageService {
	
	List<Vehicule> vehicules;
	List<Employe> employes;
	
	public GestionGarageServiceImpl() {
		this.vehicules = new ArrayList<Vehicule>();
		this.employes = new ArrayList<Employe>();
	}
	
	@Override
	public Vehicule getVehicule(String immatriculation) {
		Vehicule v = null;
		for(int i = 0; i < vehicules.size(); i++) {
			if(vehicules.get(i).getImmatriculation().equals(immatriculation)) {
				v = vehicules.get(i);
			}
		}
		return v;
	}

	@Override
	public List<Vehicule> getVehiculesParMarque(String marque) {
		List<Vehicule> vehiculesMarque = new ArrayList<>();
		
		for(int i = 0; i < vehicules.size(); i++) {
			if(vehicules.get(i).getMarque().equals(marque)) {
				vehiculesMarque.add(vehicules.get(i));
			}
		}
		return vehiculesMarque;
	}

	@Override
	public List<Vehicule> getVehiculesParPrix(double prix) {
		List<Vehicule> vehiculesPrix = new ArrayList<>();
		
		for(int i = 0; i < vehicules.size(); i++) {
			if(vehicules.get(i).getPrix() == prix) {
				vehiculesPrix.add(vehicules.get(i));
			}
		}
		return vehiculesPrix;
	}

	@Override
	public List<Vehicule> getVehiculesParType(VehiculeType type) {
		List<Vehicule> vehiculesType = new ArrayList<>();
		
		for(int i = 0; i < vehicules.size(); i++) {
			if(vehicules.get(i).getType().equals(type)) {
				vehiculesType.add(vehicules.get(i));
			}
		}
		return vehiculesType;
	}

	@Override
	public List<Vehicule> getVehicules() {
		return this.vehicules;
		
	}

	@Override
	public void ajouterVehicule(Vehicule v) {
		this.vehicules.add(v);
		
	}

	@Override
	public void supprimerVehicule(Vehicule v) {
		this.vehicules.remove(v);
		
	}


	@Override
	public void ajouterEmploye(Employe e) {
		this.employes.add(e);
		
	}

	@Override
	public void supprimerEmploye(Employe e) {
		this.employes.remove(e);
		
	}

	@Override
	public void achatVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void locationVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employe> getEmployes() {
		return this.employes;
	}

}
