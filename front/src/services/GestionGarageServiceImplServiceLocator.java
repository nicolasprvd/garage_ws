/**
 * GestionGarageServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public class GestionGarageServiceImplServiceLocator extends org.apache.axis.client.Service implements services.GestionGarageServiceImplService {

    public GestionGarageServiceImplServiceLocator() {
    }


    public GestionGarageServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GestionGarageServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GestionGarageServiceImplPort
    private java.lang.String GestionGarageServiceImplPort_address = "http://localhost:9080/GarageWSBack/garageWS";

    public java.lang.String getGestionGarageServiceImplPortAddress() {
        return GestionGarageServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GestionGarageServiceImplPortWSDDServiceName = "GestionGarageServiceImplPort";

    public java.lang.String getGestionGarageServiceImplPortWSDDServiceName() {
        return GestionGarageServiceImplPortWSDDServiceName;
    }

    public void setGestionGarageServiceImplPortWSDDServiceName(java.lang.String name) {
        GestionGarageServiceImplPortWSDDServiceName = name;
    }

    public services.GestionGarageService getGestionGarageServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GestionGarageServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGestionGarageServiceImplPort(endpoint);
    }

    public services.GestionGarageService getGestionGarageServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            services.GestionGarageServiceImplPortBindingStub _stub = new services.GestionGarageServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getGestionGarageServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGestionGarageServiceImplPortEndpointAddress(java.lang.String address) {
        GestionGarageServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (services.GestionGarageService.class.isAssignableFrom(serviceEndpointInterface)) {
                services.GestionGarageServiceImplPortBindingStub _stub = new services.GestionGarageServiceImplPortBindingStub(new java.net.URL(GestionGarageServiceImplPort_address), this);
                _stub.setPortName(getGestionGarageServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GestionGarageServiceImplPort".equals(inputPortName)) {
            return getGestionGarageServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services/", "GestionGarageServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services/", "GestionGarageServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GestionGarageServiceImplPort".equals(portName)) {
            setGestionGarageServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
