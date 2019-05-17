/**
 * Vehicule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public class Vehicule  implements java.io.Serializable {
    private int anneeVehicule;

    private java.lang.String couleur;

    private boolean enVente;

    private boolean estLoue;

    private java.lang.String immatriculation;

    private int kilometrage;

    private java.lang.String marque;

    private java.lang.String modele;

    private java.lang.String moteur;

    private java.lang.String options;

    private double prix;

    private services.VehiculeType type;

    public Vehicule() {
    }

    public Vehicule(
           int anneeVehicule,
           java.lang.String couleur,
           boolean enVente,
           boolean estLoue,
           java.lang.String immatriculation,
           int kilometrage,
           java.lang.String marque,
           java.lang.String modele,
           java.lang.String moteur,
           java.lang.String options,
           double prix,
           services.VehiculeType type) {
           this.anneeVehicule = anneeVehicule;
           this.couleur = couleur;
           this.enVente = enVente;
           this.estLoue = estLoue;
           this.immatriculation = immatriculation;
           this.kilometrage = kilometrage;
           this.marque = marque;
           this.modele = modele;
           this.moteur = moteur;
           this.options = options;
           this.prix = prix;
           this.type = type;
    }


    /**
     * Gets the anneeVehicule value for this Vehicule.
     * 
     * @return anneeVehicule
     */
    public int getAnneeVehicule() {
        return anneeVehicule;
    }


    /**
     * Sets the anneeVehicule value for this Vehicule.
     * 
     * @param anneeVehicule
     */
    public void setAnneeVehicule(int anneeVehicule) {
        this.anneeVehicule = anneeVehicule;
    }


    /**
     * Gets the couleur value for this Vehicule.
     * 
     * @return couleur
     */
    public java.lang.String getCouleur() {
        return couleur;
    }


    /**
     * Sets the couleur value for this Vehicule.
     * 
     * @param couleur
     */
    public void setCouleur(java.lang.String couleur) {
        this.couleur = couleur;
    }


    /**
     * Gets the enVente value for this Vehicule.
     * 
     * @return enVente
     */
    public boolean isEnVente() {
        return enVente;
    }


    /**
     * Sets the enVente value for this Vehicule.
     * 
     * @param enVente
     */
    public void setEnVente(boolean enVente) {
        this.enVente = enVente;
    }


    /**
     * Gets the estLoue value for this Vehicule.
     * 
     * @return estLoue
     */
    public boolean isEstLoue() {
        return estLoue;
    }


    /**
     * Sets the estLoue value for this Vehicule.
     * 
     * @param estLoue
     */
    public void setEstLoue(boolean estLoue) {
        this.estLoue = estLoue;
    }


    /**
     * Gets the immatriculation value for this Vehicule.
     * 
     * @return immatriculation
     */
    public java.lang.String getImmatriculation() {
        return immatriculation;
    }


    /**
     * Sets the immatriculation value for this Vehicule.
     * 
     * @param immatriculation
     */
    public void setImmatriculation(java.lang.String immatriculation) {
        this.immatriculation = immatriculation;
    }


    /**
     * Gets the kilometrage value for this Vehicule.
     * 
     * @return kilometrage
     */
    public int getKilometrage() {
        return kilometrage;
    }


    /**
     * Sets the kilometrage value for this Vehicule.
     * 
     * @param kilometrage
     */
    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }


    /**
     * Gets the marque value for this Vehicule.
     * 
     * @return marque
     */
    public java.lang.String getMarque() {
        return marque;
    }


    /**
     * Sets the marque value for this Vehicule.
     * 
     * @param marque
     */
    public void setMarque(java.lang.String marque) {
        this.marque = marque;
    }


    /**
     * Gets the modele value for this Vehicule.
     * 
     * @return modele
     */
    public java.lang.String getModele() {
        return modele;
    }


    /**
     * Sets the modele value for this Vehicule.
     * 
     * @param modele
     */
    public void setModele(java.lang.String modele) {
        this.modele = modele;
    }


    /**
     * Gets the moteur value for this Vehicule.
     * 
     * @return moteur
     */
    public java.lang.String getMoteur() {
        return moteur;
    }


    /**
     * Sets the moteur value for this Vehicule.
     * 
     * @param moteur
     */
    public void setMoteur(java.lang.String moteur) {
        this.moteur = moteur;
    }


    /**
     * Gets the options value for this Vehicule.
     * 
     * @return options
     */
    public java.lang.String getOptions() {
        return options;
    }


    /**
     * Sets the options value for this Vehicule.
     * 
     * @param options
     */
    public void setOptions(java.lang.String options) {
        this.options = options;
    }


    /**
     * Gets the prix value for this Vehicule.
     * 
     * @return prix
     */
    public double getPrix() {
        return prix;
    }


    /**
     * Sets the prix value for this Vehicule.
     * 
     * @param prix
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }


    /**
     * Gets the type value for this Vehicule.
     * 
     * @return type
     */
    public services.VehiculeType getType() {
        return type;
    }


    /**
     * Sets the type value for this Vehicule.
     * 
     * @param type
     */
    public void setType(services.VehiculeType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vehicule)) return false;
        Vehicule other = (Vehicule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.anneeVehicule == other.getAnneeVehicule() &&
            ((this.couleur==null && other.getCouleur()==null) || 
             (this.couleur!=null &&
              this.couleur.equals(other.getCouleur()))) &&
            this.enVente == other.isEnVente() &&
            this.estLoue == other.isEstLoue() &&
            ((this.immatriculation==null && other.getImmatriculation()==null) || 
             (this.immatriculation!=null &&
              this.immatriculation.equals(other.getImmatriculation()))) &&
            this.kilometrage == other.getKilometrage() &&
            ((this.marque==null && other.getMarque()==null) || 
             (this.marque!=null &&
              this.marque.equals(other.getMarque()))) &&
            ((this.modele==null && other.getModele()==null) || 
             (this.modele!=null &&
              this.modele.equals(other.getModele()))) &&
            ((this.moteur==null && other.getMoteur()==null) || 
             (this.moteur!=null &&
              this.moteur.equals(other.getMoteur()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            this.prix == other.getPrix() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getAnneeVehicule();
        if (getCouleur() != null) {
            _hashCode += getCouleur().hashCode();
        }
        _hashCode += (isEnVente() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEstLoue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getImmatriculation() != null) {
            _hashCode += getImmatriculation().hashCode();
        }
        _hashCode += getKilometrage();
        if (getMarque() != null) {
            _hashCode += getMarque().hashCode();
        }
        if (getModele() != null) {
            _hashCode += getModele().hashCode();
        }
        if (getMoteur() != null) {
            _hashCode += getMoteur().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        _hashCode += new Double(getPrix()).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vehicule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services/", "vehicule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anneeVehicule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anneeVehicule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couleur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "couleur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enVente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enVente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estLoue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estLoue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("immatriculation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "immatriculation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kilometrage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kilometrage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marque");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modele");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modele"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moteur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moteur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services/", "vehiculeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
