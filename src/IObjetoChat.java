import java.rmi.*;
public interface IObjetoChat extends Remote{
	public void registrar(String ip);
	
	public void enviaMensagem(String msg);
}
