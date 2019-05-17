
package services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getVehiculesParMarque", namespace = "http://services/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehiculesParMarque", namespace = "http://services/")
public class GetVehiculesParMarque {

    @XmlElement(name = "marque", namespace = "")
    private String marque;

    /**
     * 
     * @return
     *     returns String
     */
    public String getMarque() {
        return this.marque;
    }

    /**
     * 
     * @param marque
     *     the value for the marque property
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

}
