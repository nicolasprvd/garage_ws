
package services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getVehicule", namespace = "http://services/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehicule", namespace = "http://services/")
public class GetVehicule {

    @XmlElement(name = "immatriculation", namespace = "")
    private String immatriculation;

    /**
     * 
     * @return
     *     returns String
     */
    public String getImmatriculation() {
        return this.immatriculation;
    }

    /**
     * 
     * @param immatriculation
     *     the value for the immatriculation property
     */
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

}
