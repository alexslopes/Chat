import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ObjetoChat extends UnicastRemoteObject implements IObjetoChat{

	protected ObjetoChat() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void registrar(String ip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviaMensagem(String msg) {
		// TODO Auto-generated method stub
		
	}

	
}
