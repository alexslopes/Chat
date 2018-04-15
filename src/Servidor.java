import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Servidor {
	String thisAdress;
	static ServerSocket socket;
	int      port;
    String   address;
    Registry objetoChat;
	
	public void criarConfigurarPorta() {
		try {
			this.socket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Servidor() throws RemoteException {
		try{
            // get the address of this host.
            address= (InetAddress.getLocalHost()).toString();
        }
        catch(Exception e){
            throw new RemoteException("can't get inet address.");
        }
        port=1324;  // this port(registrys port)
        System.out.println("this address="+address+",port="+port);
        try{
        // create the registry and bind the name and object.
        	objetoChat = LocateRegistry.createRegistry( port );
        	objetoChat.rebind("ObjetoChat", (Remote) this);
        }
        catch(RemoteException e){
        throw e;
        }
	}
	
	 public static void main(String[] args) throws IOException {
		
		 while(true){
	            Thread t = new Thread(new Tratamento());
	            t.start();
	        }
	 }
}
