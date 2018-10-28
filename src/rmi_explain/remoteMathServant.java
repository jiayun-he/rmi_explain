package rmi_explain;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//This class is the servant compenent in RMI, which implements specific functions 
public class remoteMathServant extends UnicastRemoteObject implements remoteMath{
	protected remoteMathServant() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public int add(int a, int b) throws RemoteException {
		return a + b;
	}
}
