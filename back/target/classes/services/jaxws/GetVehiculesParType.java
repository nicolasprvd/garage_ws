
package services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getVehiculesParType", namespace = "http://services/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehiculesParType", namespace = "http://services/")
public class GetVehiculesParType {

    @XmlElement(name = "type", namespace = "")
    private models.VehiculeType type;

    /**
     * 
     * @return
     *     returns VehiculeType
     */
    public models.VehiculeType getType() {
        return this.type;
    }

    /**
     * 
     * @param type
     *     the value for the type property
     */
    public void setType(models.VehiculeType type) {
        this.type = type;
    }

}
