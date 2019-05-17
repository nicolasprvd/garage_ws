
package services.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getVehiculesParPrixResponse", namespace = "http://services/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehiculesParPrixResponse", namespace = "http://services/")
public class GetVehiculesParPrixResponse {

    @XmlElement(name = "return", namespace = "")
    private List<models.Vehicule> _return;

    /**
     * 
     * @return
     *     returns List<Vehicule>
     */
    public List<models.Vehicule> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<models.Vehicule> _return) {
        this._return = _return;
    }

}
