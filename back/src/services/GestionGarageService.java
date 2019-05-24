package services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import models.Employe;
import models.Vehicule;
import models.VehiculeType;

@WebService
@SOAPBinding(style=Style.DOCUMENT, use=SOAPBinding.Use.LITERAL, parameterStyle= SOAPBinding.ParameterStyle.WRAPPED)
/**
 * Interface GestionGarageService
 * @author Nicolas - Audrey - Maroua
 *
 */
public interface GestionGarageService {
	
	/**
	 * M�thode d'ajout d'un v�hicule
	 * @param v
	 * @throws VehiculeException 
	 */
	@WebMethod(operationName = "ajouterVehicule")
	void ajouterVehicule(@WebParam(name="vehicule") Vehicule v) throws VehiculeException;
	
	
	/**
	 * M�thode de suppression d'un v�hicule
	 * @param v
	 */
	@WebMethod(operationName = "supprimerVehicule")
	void supprimerVehicule(@WebParam(name = "vehicule") Vehicule v);
	
	/**
	 * M�thode retournant la liste des v�hicules
	 * @return List
	 */
	@WebMethod(operationName = "getVehicules")
	List<Vehicule> getVehicules();
	
	/**
	 * M�thode retournant un v�hicule par son immatriculation
	 * @param immatriculation
	 * @return Vehicule
	 */
	@WebMethod(operationName = "getVehicule")
	Vehicule getVehicule(@WebParam(name="immatriculation") String immatriculation);
	
	/**
	 * M�thode retournant les v�hicules par marque
	 * @param marque
	 * @return List
	 */
	@WebMethod(operationName = "getVehiculesParMarque")
	List<Vehicule> getVehiculesParMarque(@WebParam(name="marque") String marque);
	
	/**
	 * M�thode retournant les v�hicules par prix
	 * @param prix
	 * @return List
	 */
	@WebMethod(operationName = "getVehiculesParPrix")
	List<Vehicule> getVehiculesParPrix(@WebParam(name="prix") double prix);
	
	/**
	 * M�thode retournant les v�hicules par type
	 * @param type
	 * @return
	 */
	@WebMethod(operationName = "getVehiculesParType")
	List<Vehicule> getVehiculesParType(@WebParam(name="type") VehiculeType type);
	
	/**
	 * M�thode de retour les vehicules par tranche de prix
	 * @param prixMin
	 * @param prixMax
	 */
	@WebMethod(operationName = "getVehiculesParTrancheDePrix")
	List<Vehicule> getVehiculesParTrancheDePrix(@WebParam(name="PrixMin") double prixMin, @WebParam(name="prixMax") double prixMax);

	/**
	 * M�thode de retour les vehicules par tranche de kilometre
	 * @param kmMin
	 * @param kmMax
	 */
	@WebMethod(operationName = "getVehiculesParTrancheDeKM")
	List<Vehicule> getVehiculesParTrancheDeKM(@WebParam(name="kmMin") int kmMin, @WebParam(name="kmMax") int kmMax);

	/**
	 * M�thode de retour les vehicules par recherche de plusieurs crit�res important
	 * @param marque
	 * @param modele
	 * @param moteur
	 * @param kmMin
	 * @param kmMax
	 * @param prixMin
	 * @param prixMax
	 */
	@WebMethod(operationName = "getVehiculesParDifferentsCriteres")
	List<Vehicule> getVehiculesParDifferentsCriteres(@WebParam(name="marque") String marque, @WebParam(name="modele") String modele, @WebParam(name="moteur") String moteur, @WebParam(name="kmMin")int kmMin, @WebParam(name="kmMax") int kmMax,
			@WebParam(name="prixMin") double prixMin, @WebParam(name="prixMax") double prixMax);
	
	/**
	 * M�thode d'achat d'un v�hicule
	 * @param v
	 */
	@WebMethod(operationName = "achatVehicule")
	void achatVehicule(@WebParam(name="Vehicule") Vehicule v);
	
	
	/**
	 * M�thode de location d'un v�hicule
	 * @param v
	 */
	@WebMethod(operationName = "locationVehicule")
	void locationVehicule(@WebParam(name="Vehicule") Vehicule v);

	/**
	 * M�thode de retour delocation d'un v�hicule
	 * @param v
	 */
	@WebMethod(operationName = "retourLocationVehicule")
	void retourLocationVehicule(@WebParam(name="Vehicule") Vehicule v);
	
	/**
	 * M�thode d'ajout d'un employe
	 * @param e
	 * @throws EmployeException 
	 */
	@WebMethod(operationName = "ajouterEmploye")
	void ajouterEmploye(@WebParam(name="employe") Employe e) throws EmployeException;
	
	/**
	 * M�thode retournant les employ�s
	 * @param e
	 */
	@WebMethod(operationName = "getEmployes")
	List<Employe> getEmployes();
	
	/**
	 * M�thode de suppression d'un v�hicule
	 * @param v
	 */
	@WebMethod(operationName = "supprimerEmploye")
	void supprimerEmploye(@WebParam(name = "employe") Employe e);
	
	/**
	 * M�thode retournant le stock de v�hicules
	 */
	@WebMethod(operationName = "stock")
	int getStock();

}
