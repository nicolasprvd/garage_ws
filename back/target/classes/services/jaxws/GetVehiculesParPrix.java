
package services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getVehiculesParPrix", namespace = "http://services/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehiculesParPrix", namespace = "http://services/")
public class GetVehiculesParPrix {

    @XmlElement(name = "prix", namespace = "")
    private double prix;

    /**
     * 
     * @return
     *     returns double
     */
    public double getPrix() {
        return this.prix;
    }

    /**
     * 
     * @param prix
     *     the value for the prix property
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

}
