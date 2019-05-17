/**
 * Employe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public class Employe  implements java.io.Serializable {
    private java.lang.String fonction;

    private java.lang.String mail;

    private int matricule;

    private java.lang.String motDdePasse;

    private java.lang.String nom;

    private java.lang.String prenom;

    private java.lang.String telephone;

    public Employe() {
    }

    public Employe(
           java.lang.String fonction,
           java.lang.String mail,
           int matricule,
           java.lang.String motDdePasse,
           java.lang.String nom,
           java.lang.String prenom,
           java.lang.String telephone) {
           this.fonction = fonction;
           this.mail = mail;
           this.matricule = matricule;
           this.motDdePasse = motDdePasse;
           this.nom = nom;
           this.prenom = prenom;
           this.telephone = telephone;
    }


    /**
     * Gets the fonction value for this Employe.
     * 
     * @return fonction
     */
    public java.lang.String getFonction() {
        return fonction;
    }


    /**
     * Sets the fonction value for this Employe.
     * 
     * @param fonction
     */
    public void setFonction(java.lang.String fonction) {
        this.fonction = fonction;
    }


    /**
     * Gets the mail value for this Employe.
     * 
     * @return mail
     */
    public java.lang.String getMail() {
        return mail;
    }


    /**
     * Sets the mail value for this Employe.
     * 
     * @param mail
     */
    public void setMail(java.lang.String mail) {
        this.mail = mail;
    }


    /**
     * Gets the matricule value for this Employe.
     * 
     * @return matricule
     */
    public int getMatricule() {
        return matricule;
    }


    /**
     * Sets the matricule value for this Employe.
     * 
     * @param matricule
     */
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }


    /**
     * Gets the motDdePasse value for this Employe.
     * 
     * @return motDdePasse
     */
    public java.lang.String getMotDdePasse() {
        return motDdePasse;
    }


    /**
     * Sets the motDdePasse value for this Employe.
     * 
     * @param motDdePasse
     */
    public void setMotDdePasse(java.lang.String motDdePasse) {
        this.motDdePasse = motDdePasse;
    }


    /**
     * Gets the nom value for this Employe.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Employe.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the prenom value for this Employe.
     * 
     * @return prenom
     */
    public java.lang.String getPrenom() {
        return prenom;
    }


    /**
     * Sets the prenom value for this Employe.
     * 
     * @param prenom
     */
    public void setPrenom(java.lang.String prenom) {
        this.prenom = prenom;
    }


    /**
     * Gets the telephone value for this Employe.
     * 
     * @return telephone
     */
    public java.lang.String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this Employe.
     * 
     * @param telephone
     */
    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employe)) return false;
        Employe other = (Employe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fonction==null && other.getFonction()==null) || 
             (this.fonction!=null &&
              this.fonction.equals(other.getFonction()))) &&
            ((this.mail==null && other.getMail()==null) || 
             (this.mail!=null &&
              this.mail.equals(other.getMail()))) &&
            this.matricule == other.getMatricule() &&
            ((this.motDdePasse==null && other.getMotDdePasse()==null) || 
             (this.motDdePasse!=null &&
              this.motDdePasse.equals(other.getMotDdePasse()))) &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.prenom==null && other.getPrenom()==null) || 
             (this.prenom!=null &&
              this.prenom.equals(other.getPrenom()))) &&
            ((this.telephone==null && other.getTelephone()==null) || 
             (this.telephone!=null &&
              this.telephone.equals(other.getTelephone())));
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
        if (getFonction() != null) {
            _hashCode += getFonction().hashCode();
        }
        if (getMail() != null) {
            _hashCode += getMail().hashCode();
        }
        _hashCode += getMatricule();
        if (getMotDdePasse() != null) {
            _hashCode += getMotDdePasse().hashCode();
        }
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getPrenom() != null) {
            _hashCode += getPrenom().hashCode();
        }
        if (getTelephone() != null) {
            _hashCode += getTelephone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services/", "employe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fonction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fonction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motDdePasse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motDdePasse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prenom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prenom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
