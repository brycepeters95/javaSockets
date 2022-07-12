import java.io.*;
import java.net.*;

public class Server {
	public static final int port = 5000;
	public static void main(String[] args) throws IOException{
		new Server().runServer();
	}
		public void runServer()throws IOException{
			try {
				ServerSocket serverSocket= new ServerSocket(port);
				System.out.println("waiting for connections...");
				while(true) {
					Socket client = serverSocket.accept();
					new ServerThread(client).start();
					
//					 new Thread(clientSock).start();
				}
				
			}catch (IOException e){
				e.printStackTrace();
			}
		}
		
		 

	}


