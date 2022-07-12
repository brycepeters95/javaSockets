
import java.io.*;
import java.net.*;
import java.net.Socket;
import java.io.InputStreamReader;

public class ServerThread extends Thread {
	Socket socket;
	
		public ServerThread(Socket socket) {
			this.socket = socket;
		}
		public void run() {
			try {
				String message = null;
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while((message = bufferedReader.readLine()) != null) {	
					System.out.println("incoming client message:" +message+","+ socket);
				}
				socket.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

	


