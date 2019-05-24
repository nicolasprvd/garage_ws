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
/**
 * Classe GestionGarageServiceImpl
 * Implémente l'interface GestionGarageService
 * 
 * @author Nicolas - Audrey - Maroua
 *
 */
public class GestionGarageServiceImpl implements GestionGarageService {

	String chemin = System.getProperty("user.dir") + "/WebContent/WEB-INF/data/";
	
	public GestionGarageServiceImpl() {}
	
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
	public List<Vehicule> getVehiculesParTrancheDePrix(double prixMin, double prixMax) {
		List<Vehicule> vehiculesPrix = new ArrayList<>();
		for(int i = 0; i < getVehicules().size(); i++) {
			Vehicule v = getVehicules().get(i);
			if(v.getPrix() >= prixMin && v.getPrix() <= prixMax) {
				vehiculesPrix.add(v);
			}
		}
		return vehiculesPrix;
	}
	
	@Override
	public List<Vehicule> getVehiculesParTrancheDeKM(int kmMin, int kmMax) {
		List<Vehicule> vehiculesKm = new ArrayList<>();
		for(int i = 0; i < getVehicules().size(); i++) {
			Vehicule v = getVehicules().get(i);
			if(v.getKilometrage() >= kmMin && v.getKilometrage() <= kmMax) {
				vehiculesKm.add(v);
			}
		}
		return vehiculesKm;
	}
	
	@Override
	public List<Vehicule> getVehiculesParDifferentsCriteres(String marque, String modele, String moteur, int kmMin, int kmMax, double prixMin, double prixMax) {
		List<Vehicule> vehiculesCriteres = new ArrayList<>();
		for(int i = 0; i < getVehicules().size(); i++) {
			Vehicule v = getVehicules().get(i);	
			
			//Si aucun modele n'a été renseigner
			if (modele == null) {
				if(v.getMarque().equals(marque) && v.getMoteur().equals(moteur) && v.getKilometrage() >= kmMin && v.getKilometrage() <= kmMax && v.getPrix() >= prixMin && v.getPrix() <= prixMax) {
					vehiculesCriteres.add(v);
				}
			}
			//Sinon
			else {
				if(v.getMarque().equals(marque) && v.getModele().equals(modele) && v.getMoteur().equals(moteur) && v.getKilometrage() >= kmMin && v.getKilometrage() <= kmMax && v.getPrix() >= prixMin && v.getPrix() <= prixMax) {
					vehiculesCriteres.add(v);
				}
			}	
		}
		return vehiculesCriteres;
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
	public void ajouterVehicule(Vehicule v) throws VehiculeException {
		Vehicules vehicules = getVehiculesXML();
		
		//Fichier xml vide
		if(vehicules == null) {
			vehicules = new Vehicules();
		}
		//sinon , nous verifions qu'il n'y a pas deja un vehicule avec cette immatriculation (l'immatriculation est unique et identifie le vehicule)
		else {
			for (int i =  0 ; i < vehicules.getVehicules().size() ; i++) {
				if (vehicules.getVehicules().get(i).getImmatriculation().equals(v.getImmatriculation())){
					throw new VehiculeException(v);
				}
			}
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
	public void ajouterEmploye(Employe e) throws EmployeException {
		Employes employes = getEmployesXML();
		
		//Fichier xml vide
		if(employes == null) {
			employes = new Employes();
		}
		//sinon , nous verifions qu'il n'y a pas deja un employe avec ce matricule (le matricule est unique et identifie le lemploye)
		else {
			for (int i =  0 ; i < employes.getEmployes().size() ; i++) {
				if (employes.getEmployes().get(i).getMatricule() == e.getMatricule()){
					throw new EmployeException(e);
				}
			}
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
		//On verifie 
		if (v.isEnVente() == true) {
			supprimerVehicule(v);
		}
		else {
			System.out.println("Ce vehicule est destiné à la location");
		}
		
		
	}

	@Override
	public void locationVehicule(Vehicule v) {

			if (v.isEnVente() == true) {
				System.out.println("Ce vehicule est destiné à la vente");
			}
			else {
				if (v.isEstLoue() == true) {
					System.out.println("Ce vehicule est actuellement en location, si vous voulez celui-ci il faudra attendre son retour");
				}
				else {
					v.setEstLoue(true);
					Vehicules vehicules = getVehiculesXML();
					for (int i =  0 ; i < vehicules.getVehicules().size() ; i++) {
						if (vehicules.getVehicules().get(i).getImmatriculation().equals(v.getImmatriculation())){
							vehicules.getVehicules().set(i, v);
							setVehicules(vehicules);
						}
					}
					
				}
			}
	}
	
	@Override
	public void retourLocationVehicule(Vehicule v) {
			v.setEstLoue(false);
			Vehicules vehicules = getVehiculesXML();
			for (int i =  0 ; i < vehicules.getVehicules().size() ; i++) {
				if (vehicules.getVehicules().get(i).getImmatriculation().equals(v.getImmatriculation())){
					vehicules.getVehicules().set(i, v);
					setVehicules(vehicules);
				}
			}

	}

	@Override
	public List<Employe> getEmployes() {
		return getEmployesXML().getEmployes();
	}
	
	private Vehicules getVehiculesXML() {
		try {
            return JAXBParse.unmarshal(Vehicules.class, new File(chemin + "vehicules.xml"));
        } catch (JAXBException e) {
            return null;
        }
	}
	
	private void setVehicules(Vehicules vehicules) {
		try {
            JAXBParse.marshal(vehicules, chemin + "vehicules.xml", new File(chemin + "vehicules.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
	}
	
	private Employes getEmployesXML() {
		try {
            return JAXBParse.unmarshal(Employes.class, new File(chemin + "employes.xml"));
        } catch (JAXBException e) {
            return null;
        }
	}
	
	private void setEmployes(Employes employes) {
		try {
            JAXBParse.marshal(employes, chemin + "employes.xml", new File(chemin + "employes.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
	}


	@Override
	public int getStock() {
		int stock = 0;
		if(getEmployesXML() != null) {
			stock = getVehiculesXML().getVehicules().size();
		}
		return stock;
	}

	

}
