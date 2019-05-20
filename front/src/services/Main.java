package services;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) {
		
		
		GestionGarageServiceProxy g = new GestionGarageServiceProxy();
		try {
			Vehicule[] v = g.getVehicules();
			System.out.println(v[0]);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
