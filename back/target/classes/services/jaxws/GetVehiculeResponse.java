
package services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getVehiculeResponse", namespace = "http://services/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehiculeResponse", namespace = "http://services/")
public class GetVehiculeResponse {

    @XmlElement(name = "return", namespace = "")
    private models.Vehicule _return;

    /**
     * 
     * @return
     *     returns Vehicule
     */
    public models.Vehicule getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(models.Vehicule _return) {
        this._return = _return;
    }

}
