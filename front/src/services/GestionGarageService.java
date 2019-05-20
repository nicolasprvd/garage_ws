/**
 * GestionGarageService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public interface GestionGarageService extends java.rmi.Remote {
    public services.Vehicule[] getVehicules() throws java.rmi.RemoteException;
    public void ajouterVehicule(services.Vehicule vehicule) throws java.rmi.RemoteException;
    public void supprimerEmploye(services.Employe employe) throws java.rmi.RemoteException;
    public services.Employe[] getEmployes() throws java.rmi.RemoteException;
    public void ajouterEmploye(services.Employe arg0) throws java.rmi.RemoteException;
    public void achatVehicule(services.Vehicule arg0) throws java.rmi.RemoteException;
    public void locationVehicule(services.Vehicule arg0) throws java.rmi.RemoteException;
    public services.Vehicule getVehicule(java.lang.String immatriculation) throws java.rmi.RemoteException;
    public services.Vehicule[] getVehiculesParType(services.VehiculeType type) throws java.rmi.RemoteException;
    public services.Vehicule[] getVehiculesParPrix(double prix) throws java.rmi.RemoteException;
    public services.Vehicule[] getVehiculesParMarque(java.lang.String marque) throws java.rmi.RemoteException;
    public void supprimerVehicule(services.Vehicule vehicule) throws java.rmi.RemoteException;
}
