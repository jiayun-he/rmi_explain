package rmi_explain;

import java.rmi.Remote;
import java.rmi.RemoteException;

//This is the class provides proxy, 
// dispatcher and skeleton
// 3 components of a RMI software.

public interface remoteMath extends Remote {
	public int add(int a, int b) throws RemoteException;
}
