package collections;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import models.Vehicule;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="vehicules", propOrder = {"vehicule"})
@XmlRootElement(name = "vehicules")
public class Vehicules {
	
	protected List<Vehicule> vehicule;
	
	public Vehicules() {}
	
	public List<Vehicule> getVehicules() {
		if(vehicule == null) {
			vehicule = new ArrayList<>();
		}
		return this.vehicule;
	}
	
	public void ajouterVehicule(Vehicule v) {
		this.vehicule.add(v);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vehicule == null) ? 0 : vehicule.hashCode());
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
		Vehicules other = (Vehicules) obj;
		if (vehicule == null) {
			if (other.vehicule != null)
				return false;
		} else if (!vehicule.equals(other.vehicule))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicules [vehicules=" + vehicule + "]";
	}
	
	

}
