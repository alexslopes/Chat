import java.rmi.*;
public interface IObjetoChat extends Remote{
	public void registrar(String ip, String port);
	
	public void enviaMensagem(String msg);
}
