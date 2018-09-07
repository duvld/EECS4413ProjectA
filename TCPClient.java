import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;


public class TCPClient {
	
	
	public static void main(String args[]) throws IOException {
		Socket socket = new Socket("localhost", 1024);
//		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		System.out.println("server says:" + br.readLine());
//		
//		
//
//		
//		BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
//		String userInput = userInputReader.readLine();
//		
//		System.out.println("server says:" + br.readLine());
//		Worker worker = new Worker(socket);
//		worker.handle();

	}

}
