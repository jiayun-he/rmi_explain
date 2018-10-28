package rmi_explain;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	public static void main(String[] args) {
		//init the remote object (servant)
		try {
			remoteMath mathObj = new remoteMathServant();
			//public the object to the registry
			Registry r = LocateRegistry.getRegistry();
			r.bind("math", mathObj);
			System.out.println("Remote server ready.");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
