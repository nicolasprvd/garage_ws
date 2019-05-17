package models;

public class Employe {
	
	private int matricule;
	private String nom;
	private String prenom;
	private String fonction;
	private String telephone;
	private String mail;
	private String motDdePasse;
	
	public Employe() {}

	public Employe(int matricule, String nom, String prenom, String fonction, String telephone, String mail, String motDdePasse) {
		this.matricule+=1;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.telephone = telephone;
		this.mail = mail;
		this.motDdePasse = motDdePasse;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotDdePasse() {
		return motDdePasse;
	}

	public void setMotDdePasse(String motDdePasse) {
		this.motDdePasse = motDdePasse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fonction == null) ? 0 : fonction.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + matricule;
		result = prime * result + ((motDdePasse == null) ? 0 : motDdePasse.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
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
		Employe other = (Employe) obj;
		if (fonction == null) {
			if (other.fonction != null)
				return false;
		} else if (!fonction.equals(other.fonction))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (matricule != other.matricule)
			return false;
		if (motDdePasse == null) {
			if (other.motDdePasse != null)
				return false;
		} else if (!motDdePasse.equals(other.motDdePasse))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", fonction=" + fonction
				+ ", telephone=" + telephone + ", mail=" + mail + ", motDdePasse=" + motDdePasse + "]";
	}
	
	
	
}
