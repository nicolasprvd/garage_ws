package models;

public class Vehicule {

	private String immatriculation;
	private String marque;
	private String couleur;
	private String modele;
	private String options;
	private String moteur;
	private double prix;
	private int kilometrage;
	private int anneeVehicule;
	private VehiculeType type;
	private boolean estLoue;
	private boolean enVente;
	
	public Vehicule() {}

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
		final int prime = 31;
		int result = 1;
		result = prime * result + anneeVehicule;
		result = prime * result + ((couleur == null) ? 0 : couleur.hashCode());
		result = prime * result + (enVente ? 1231 : 1237);
		result = prime * result + (estLoue ? 1231 : 1237);
		result = prime * result + kilometrage;
		result = prime * result + ((marque == null) ? 0 : marque.hashCode());
		result = prime * result + ((modele == null) ? 0 : modele.hashCode());
		result = prime * result + ((moteur == null) ? 0 : moteur.hashCode());
		result = prime * result + ((options == null) ? 0 : options.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prix);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((immatriculation == null) ? 0 : immatriculation.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicule other = (Vehicule) obj;
		if (anneeVehicule != other.anneeVehicule)
			return false;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		if (enVente != other.enVente)
			return false;
		if (estLoue != other.estLoue)
			return false;
		if (kilometrage != other.kilometrage)
			return false;
		if (marque == null) {
			if (other.marque != null)
				return false;
		} else if (!marque.equals(other.marque))
			return false;
		if (modele == null) {
			if (other.modele != null)
				return false;
		} else if (!modele.equals(other.modele))
			return false;
		if (moteur == null) {
			if (other.moteur != null)
				return false;
		} else if (!moteur.equals(other.moteur))
			return false;
		if (options == null) {
			if (other.options != null)
				return false;
		} else if (!options.equals(other.options))
			return false;
		if (Double.doubleToLongBits(prix) != Double.doubleToLongBits(other.prix))
			return false;
		if (immatriculation == null) {
			if (other.immatriculation != null)
				return false;
		} else if (!immatriculation.equals(other.immatriculation))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicule [immatriculation=" + immatriculation + ", marque=" + marque + ", couleur=" + couleur + ", modele=" + modele
				+ ", options=" + options + ", moteur=" + moteur + ", prix=" + prix + ", kilometrage=" + kilometrage
				+ ", anneeVehicule=" + anneeVehicule + ", type=" + type + ", estLoue=" + estLoue + ", enVente="
				+ enVente + "]";
	}

	

	

}
