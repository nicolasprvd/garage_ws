
package services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ajouterVehicule", namespace = "http://services/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ajouterVehicule", namespace = "http://services/")
public class AjouterVehicule {

    @XmlElement(name = "vehicule", namespace = "")
    private models.Vehicule vehicule;

    /**
     * 
     * @return
     *     returns Vehicule
     */
    public models.Vehicule getVehicule() {
        return this.vehicule;
    }

    /**
     * 
     * @param vehicule
     *     the value for the vehicule property
     */
    public void setVehicule(models.Vehicule vehicule) {
        this.vehicule = vehicule;
    }

}
