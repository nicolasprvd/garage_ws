package models;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import parsers.AuthenficationHash;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employe", propOrder = {
		"matricule",
		"nom",
		"prenom",
		"fonction",
		"telephone",
		"mail",
		"motDePasse"
})
/**
 * Classe Employe
 * @author Nicolas - Audrey - Maroua
 *
 */
public class Employe {
	
	private int matricule;
	@XmlElement(required = true)
	private String nom;
	@XmlElement(required = true)
	private String prenom;
	@XmlElement(required = true)
	private String fonction;
	@XmlElement(required = true)
	private String telephone;
	@XmlElement(required = true)
	private String mail;
	@XmlElement(required = true)
	private String motDePasse;
	
	public Employe() {}

	/**
	 * Constructeur
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param fonction
	 * @param telephone
	 * @param mail
	 * @param motDePasse
	 */
	public Employe(int matricule, String nom, String prenom, String fonction, String telephone, String mail, String motDePasse) {
		this.matricule=matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.telephone = telephone;
		this.mail = mail;
		this.motDePasse = motDePasse;
	}

	// Getters et setters
	
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
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = AuthenficationHash.hash(motDePasse);
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricule,nom, prenom, fonction, telephone, mail, motDePasse);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Employe)) {
			return false;
		}
		Employe e = (Employe) obj;
		return matricule == e.matricule && 
				Objects.equals(nom, e.nom) &&
				Objects.equals(prenom, e.prenom) &&
				Objects.equals(fonction, e.fonction) &&
				Objects.equals(telephone, e.telephone) &&
				Objects.equals(mail, e.mail) &&
				Objects.equals(motDePasse, e.motDePasse);
		
	}

	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", fonction=" + fonction
				+ ", telephone=" + telephone + ", mail=" + mail + "]";
	}
	
	
	
}
