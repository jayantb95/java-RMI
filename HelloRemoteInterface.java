import java.rmi.Remote;
import java.rmi.RemoteException;
public interface HelloRemoteInterface extends Remote{
    public void show() throws RemoteException;
}