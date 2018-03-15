import java.rmi.Remote;
import java.rmi.server.*;
import java.rmi.RemoteException;

public class HelloInterfaceImplement implements HelloRemoteInterface{
   
    public void show() throws RemoteException{
        System.out.println("hello interface implementation."+
        "\nRemote method invoked");
    }
}