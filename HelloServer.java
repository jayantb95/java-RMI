import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer extends HelloInterfaceImplement{
    public HelloServer() {}
    public static void main(String args[]) {
        try {
            // Instantiating the implementation class
            HelloInterfaceImplement obj = new HelloInterfaceImplement();
            // Exporting the object of implementation class
            // (here we are exporting the remote object to the stub)
            HelloRemoteInterface stub=(HelloRemoteInterface) UnicastRemoteObject.exportObject(obj, 0);
            // Binding the remote object (stub) in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("HelloInterfaceImplement", stub);
            System.err.println("Server ready");
        }catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
