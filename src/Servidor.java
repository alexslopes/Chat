import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {
	int port;
	String thisAdress;
	static ServerSocket socket;
	
	public void criarConfigurarPorta() {
		try {
			this.socket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 public static void main(String[] args) throws IOException {
	        
	        
	        while(true){
	           //pegar registro de todos os clientes
	        	//obs: criar objeto static
	        	//enviar msgs para todos os clientes
	        }
	    }
}
