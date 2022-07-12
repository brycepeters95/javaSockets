import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		
		Socket socket = new Socket("localhost", 5000);
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
		BufferedReader bufferedReader = new java.io.BufferedReader(new InputStreamReader(System.in));
		while(true) {
		String readerInput = bufferedReader.readLine();
		printWriter.println(readerInput);
		}		

	}

}
