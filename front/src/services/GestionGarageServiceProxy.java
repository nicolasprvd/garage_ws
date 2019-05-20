package services;

public class GestionGarageServiceProxy implements services.GestionGarageService {
  private String _endpoint = null;
  private services.GestionGarageService gestionGarageService = null;
  
  public GestionGarageServiceProxy() {
    _initGestionGarageServiceProxy();
  }
  
  public GestionGarageServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGestionGarageServiceProxy();
  }
  
  private void _initGestionGarageServiceProxy() {
    try {
      gestionGarageService = (new services.GestionGarageServiceImplServiceLocator()).getGestionGarageServiceImplPort();
      if (gestionGarageService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gestionGarageService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gestionGarageService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gestionGarageService != null)
      ((javax.xml.rpc.Stub)gestionGarageService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public services.GestionGarageService getGestionGarageService() {
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    return gestionGarageService;
  }
  
  public services.Vehicule[] getVehicules() throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    return gestionGarageService.getVehicules();
  }
  
  public void ajouterVehicule(services.Vehicule vehicule) throws java.rmi.RemoteException, services.VehiculeException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    gestionGarageService.ajouterVehicule(vehicule);
  }
  
  public void supprimerVehicule(services.Vehicule vehicule) throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    gestionGarageService.supprimerVehicule(vehicule);
  }
  
  public services.Vehicule[] getVehiculesParMarque(java.lang.String marque) throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    return gestionGarageService.getVehiculesParMarque(marque);
  }
  
  public services.Vehicule[] getVehiculesParPrix(double prix) throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    return gestionGarageService.getVehiculesParPrix(prix);
  }
  
  public services.Vehicule[] getVehiculesParType(services.VehiculeType type) throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    return gestionGarageService.getVehiculesParType(type);
  }
  
  public void retourLocationVehicule(services.Vehicule vehicule) throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    gestionGarageService.retourLocationVehicule(vehicule);
  }
  
  public services.Vehicule getVehicule(java.lang.String immatriculation) throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    return gestionGarageService.getVehicule(immatriculation);
  }
  
  public void ajouterEmploye(services.Employe arg0) throws java.rmi.RemoteException, services.EmployeException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    gestionGarageService.ajouterEmploye(arg0);
  }
  
  public void supprimerEmploye(services.Employe employe) throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    gestionGarageService.supprimerEmploye(employe);
  }
  
  public void locationVehicule(services.Vehicule vehicule) throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    gestionGarageService.locationVehicule(vehicule);
  }
  
  public void achatVehicule(services.Vehicule vehicule) throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    gestionGarageService.achatVehicule(vehicule);
  }
  
  public services.Employe[] getEmployes() throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    return gestionGarageService.getEmployes();
  }
  
  public services.Vehicule[] getVehiculesParTrancheDeKM(int kmMin, int kmMax) throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    return gestionGarageService.getVehiculesParTrancheDeKM(kmMin, kmMax);
  }
  
  public services.Vehicule[] getVehiculesParTrancheDePrix(double prixMin, double prixMax) throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    return gestionGarageService.getVehiculesParTrancheDePrix(prixMin, prixMax);
  }
  
  public services.Vehicule[] getVehiculesParDifferentsCriteres(java.lang.String marque, java.lang.String modele, java.lang.String moteur, int kmMin, int kmMax, double prixMin, double prixMax) throws java.rmi.RemoteException{
    if (gestionGarageService == null)
      _initGestionGarageServiceProxy();
    return gestionGarageService.getVehiculesParDifferentsCriteres(marque, modele, moteur, kmMin, kmMax, prixMin, prixMax);
  }
  
  
}