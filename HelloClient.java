import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient{
    public static void main(String[] args) {
        try {
            // Getting the registry
            Registry registry = LocateRegistry.getRegistry(null);
            // Looking up the registry for the remote object
            HelloRemoteInterface stub = (HelloRemoteInterface) registry.lookup("HelloInterfaceImplement");
            // Calling the remote method using the obtained object
            stub.show();
            // System.out.println("Remote method invoked");
        }catch(Exception e){
            System.err.println("client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}