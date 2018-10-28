package rmi_explain;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	public static void main(String[] args) {
		//look up the binding in the registry
		try {
			Registry r = LocateRegistry.getRegistry("localhost");
			//create the proxy and add proxy to local remote reference module
			remoteMath mathObj = (remoteMath)r.lookup("math");
			//access the object with proxy
			System.out.println("1 + 2 = " + mathObj.add(1, 2));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
