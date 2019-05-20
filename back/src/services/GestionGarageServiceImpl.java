package services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.xml.bind.JAXBException;

import collections.Employes;
import collections.Vehicules;
import models.Employe;
import models.Vehicule;
import models.VehiculeType;
import parsers.JAXBParse;

@WebService(endpointInterface = "services.GestionGarageService")
public class GestionGarageServiceImpl implements GestionGarageService {
	
	List<Vehicule> vehicules;
	List<Employe> employes;
	String chemin;
	
	public GestionGarageServiceImpl() {}
	
	public GestionGarageServiceImpl(String chemin) {
		this.chemin = chemin;
	}
	
	@Override
	public Vehicule getVehicule(String immatriculation) {
		for(int i = 0; i < this.getVehicules().size(); i++) {
			Vehicule v = getVehicules().get(i);
			if(v.getImmatriculation().equals(immatriculation)) {
				return v;
			}
		}
		return null;
	}

	@Override
	public List<Vehicule> getVehiculesParMarque(String marque) {
		List<Vehicule> vehiculesMarque = new ArrayList<>();
		for(int i = 0; i < getVehicules().size(); i++) {
			Vehicule v = getVehicules().get(i);
			if(v.getMarque().equals(marque)) {
				vehiculesMarque.add(v);
			}
		}
		return vehiculesMarque;
	}

	@Override
	public List<Vehicule> getVehiculesParPrix(double prix) {
		List<Vehicule> vehiculesPrix = new ArrayList<>();
		for(int i = 0; i < getVehicules().size(); i++) {
			Vehicule v = getVehicules().get(i);
			if(v.getPrix() == prix) {
				vehiculesPrix.add(v);
			}
		}
		return vehiculesPrix;
	}

	@Override
	public List<Vehicule> getVehiculesParType(VehiculeType type) {
		List<Vehicule> vehiculesType = new ArrayList<>();
		for(int i = 0; i < getVehicules().size(); i++) {
			Vehicule v = getVehicules().get(i);
			if(v.getType().equals(type)) {
				vehiculesType.add(v);
			}
		}
		return vehiculesType;
	}

	@Override
	public List<Vehicule> getVehicules() {
		return getVehiculesXML().getVehicules();
		
	}

	@Override
	public void ajouterVehicule(Vehicule v) {
		Vehicules vehicules = getVehiculesXML();
		
		//Fichier xml vide
		if(vehicules == null) {
			vehicules = new Vehicules();
		}
		vehicules.getVehicules().add(v);
		setVehicules(vehicules);   
	}

	@Override
	public void supprimerVehicule(Vehicule v) {
		Vehicules vehicules = getVehiculesXML();
		if(vehicules != null) {
			vehicules.getVehicules().remove(v);
			setVehicules(vehicules);
		}
		//Exception		
	}


	@Override
	public void ajouterEmploye(Employe e) {
		Employes employes = getEmployesXML();
		
		//Fichier xml vide
		if(employes == null) {
			employes = new Employes();
		}
		employes.getEmployes().add(e);
		setEmployes(employes);   
		
	}

	@Override
	public void supprimerEmploye(Employe e) {
		Employes employes = getEmployesXML();
		if(employes != null) {
			employes.getEmployes().remove(e);
			setEmployes(employes);
		}
		
	}

	@Override
	public void achatVehicule(Vehicule v) {
		supprimerVehicule(v);
		
	}

	@Override
	public void locationVehicule(Vehicule v) {
		v.setEstLoue(true);
		//Pas sur
	}

	@Override
	public List<Employe> getEmployes() {
		return this.employes;
	}
	
	private Vehicules getVehiculesXML() {
		try {
            return JAXBParse.unmarshal(Vehicules.class, new File("D:/MIAGE/S8/WebServices/GarageWSBack/WebContent/WEB-INF/data/vehicules.xml"));
        } catch (JAXBException e) {
            return null;
        }
	}
	
	private void setVehicules(Vehicules vehicules) {
		try {
            JAXBParse.marshal(vehicules, "D:/MIAGE/S8/WebServices/GarageWSBack/WebContent/WEB-INF/data/vehicules.xml", new File("D:/MIAGE/S8/WebServices/GarageWSBack/WebContent/WEB-INF/data/vehicules.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
	}
	
	private Employes getEmployesXML() {
		try {
            return JAXBParse.unmarshal(Employes.class, new File("D:/MIAGE/S8/WebServices/GarageWSBack/WebContent/WEB-INF/data/employes.xml"));
        } catch (JAXBException e) {
            return null;
        }
	}
	
	private void setEmployes(Employes employes) {
		try {
            JAXBParse.marshal(employes, "D:/MIAGE/S8/WebServices/GarageWSBack/WebContent/WEB-INF/data/vehicules.xml", new File("D:/MIAGE/S8/WebServices/GarageWSBack/WebContent/WEB-INF/data/employes.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
	}

}
