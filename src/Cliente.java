import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
	
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		String serverAddress=args[0];
	    String serverPort=args[1];
	    String clientPort = args[2];
	    String text=args[3];
		IObjetoChat obj;
		Registry registry;
		try {
			registry = LocateRegistry.getRegistry(
					serverAddress, new Integer(serverPort).intValue());
			obj = (IObjetoChat)(registry.lookup("ObjetoChat"));
			obj.registrar(InetAddress.getLocalHost().getHostName(), clientPort);
			obj.enviaMensagem(text);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
