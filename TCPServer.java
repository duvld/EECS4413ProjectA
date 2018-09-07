import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public TCPServer(int port) throws IOException{
		//Init Server
		ServerSocket server = new ServerSocket(port);
		System.out.println("Connected to port: " + server.getLocalPort());

		
		//Worker Code
		while(true) {		
			Socket socket = server.accept();
			Worker worker = new Worker(socket);
			worker.handle();

//			OutputStream output = socket.getOutputStream();
//			PrintWriter pw = new PrintWriter(output, true);
//			System.out.println("what is your name: ");
//			
//			
//			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			String inputReader = input.readLine();
//			
			socket.close();
			System.out.println("Goodbye");
		}
	}
	
	public static void main(String args[]) throws IOException {
		TCPServer tcp = new TCPServer(1024);
		
	}
}
