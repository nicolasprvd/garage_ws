package models;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicule", propOrder = { "immatriculation", "marque", "modele", "couleur", "moteur", "options", "prix",
		"kilometrage", "anneeVehicule", "type", "estLoue", "enVente" })
public class Vehicule {

	@XmlElement(required = true)
	private String immatriculation;
	@XmlElement(required = true)
	private String marque;
	@XmlElement(required = true)
	private String couleur;
	@XmlElement(required = true)
	private String modele;
	@XmlElement(required = true)
	private String options;
	@XmlElement(required = true)
	private String moteur;
	@XmlElement(required = true)
	private double prix;
	@XmlElement(required = true)
	private int kilometrage;
	@XmlElement(required = true)
	private int anneeVehicule;
	@XmlElement(required = false)
	private VehiculeType type;
	@XmlElement(required = true)
	private boolean estLoue;
	@XmlElement(required = true)
	private boolean enVente;

	public Vehicule() {
	}

	public Vehicule(String immatriculation, String marque, String couleur, String modele, String options, String moteur,
			double prix, int kilometrage, int anneeVehicule, VehiculeType type, boolean estLoue, boolean enVente) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.couleur = couleur;
		this.modele = modele;
		this.options = options;
		this.moteur = moteur;
		this.prix = prix;
		this.kilometrage = kilometrage;
		this.anneeVehicule = anneeVehicule;
		this.type = type;
		this.estLoue = estLoue;
		this.enVente = enVente;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getMoteur() {
		return moteur;
	}

	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	public int getAnneeVehicule() {
		return anneeVehicule;
	}

	public void setAnneeVehicule(int anneeVehicule) {
		this.anneeVehicule = anneeVehicule;
	}

	public boolean isEstLoue() {
		return estLoue;
	}

	public void setEstLoue(boolean estLoue) {
		this.estLoue = estLoue;
	}

	public boolean isEnVente() {
		return enVente;
	}

	public void setEnVente(boolean enVente) {
		this.enVente = enVente;
	}

	public VehiculeType getType() {
		return type;
	}

	public void setType(VehiculeType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(immatriculation, marque, modele, couleur, moteur, options, prix, kilometrage, anneeVehicule,
				type, estLoue, enVente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Vehicule)) {
			return false;
		}
		Vehicule v = (Vehicule) obj;
		return Objects.equals(immatriculation, v.immatriculation) &&
				Objects.equals(marque, v.marque) &&
				Objects.equals(modele, v.modele) && 
				Objects.equals(couleur, v.couleur) &&
				Objects.equals(moteur, v.moteur) &&
				Objects.equals(options, v.options) &&
				prix == v.prix &&
				kilometrage == v.kilometrage &&
				anneeVehicule == v.anneeVehicule &&
				Objects.equals(type, v.type) &&
				Objects.equals(estLoue, v.estLoue) &&
				Objects.equals(enVente, v.enVente);
	}

	@Override
	public String toString() {
		return "Vehicule [immatriculation=" + immatriculation + ", marque=" + marque + ", couleur=" + couleur
				+ ", modele=" + modele + ", options=" + options + ", moteur=" + moteur + ", prix=" + prix
				+ ", kilometrage=" + kilometrage + ", anneeVehicule=" + anneeVehicule + ", type=" + type + ", estLoue="
				+ estLoue + ", enVente=" + enVente + "]";
	}

}
