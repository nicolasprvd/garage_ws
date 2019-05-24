package collections;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import models.Employe;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="employes", propOrder = {"employe"})
@XmlRootElement(name = "employes")
/**
 * Classe Employes
 * @author Nicolas - Audrey - Maroua
 *
 */
public class Employes {
	
	protected List<Employe> employe;
	
	/**
	 * Récupère la liste des employés
	 * @return List employes
	 */
	public List<Employe> getEmployes() {
		if(employe == null) {
			employe = new ArrayList<>();
		}
		return this.employe;
	}
	
	/**
	 * Ajoute un employé à la liste
	 * @param e
	 */
	public void ajouterEmploye(Employe e) {
		this.employe.add(e);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employe == null) ? 0 : employe.hashCode());
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
		Employes other = (Employes) obj;
		if (employe == null) {
			if (other.employe != null)
				return false;
		} else if (!employe.equals(other.employe))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employes [employes=" + employe + "]";
	}
	
	
	
	

}
