package collections;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import models.Employe;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="employes", propOrder = {"employes"})
@XmlRootElement(name = "employes")
public class Employes {
	
	protected List<Employe> employes;
	
	public List<Employe> getEmployes() {
		if(employes == null) {
			employes = new ArrayList<>();
		}
		return this.employes;
	}
	
	public void ajouterEmploye(Employe e) {
		this.employes.add(e);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employes == null) ? 0 : employes.hashCode());
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
		if (employes == null) {
			if (other.employes != null)
				return false;
		} else if (!employes.equals(other.employes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employes [employes=" + employes + "]";
	}
	
	
	
	

}
