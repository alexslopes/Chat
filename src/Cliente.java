import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Cliente {
	
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		String msg = args[0];
		String ip = args[1];
		ObjetoChat obj = (ObjetoChat) Naming.lookup("rmi://192.168.1.6:1099/CalculadoraService");
		obj.enviaMensagem(msg);
		obj.registrar(ip);
	}

}
