import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Worker {

	private Socket socket;
	private TCPServer tcp;
	private Scanner in, inCon;
	private int terminate = 0;
	private String input;
	BufferedReader br, userInputBR;

	public Worker(Socket s) throws IOException {

		// tcp = t;
		socket = s;
		in = new Scanner(socket.getInputStream());
		inCon = new Scanner(System.in);

		// OutputStream output = socket.getOutputStream();
		// PrintWriter pw = new PrintWriter(output, true);
		// System.out.println("what is your name: ");
		//
		// BufferedReader input = new BufferedReader(new
		// InputStreamReader(socket.getInputStream()));
		// String inputReader = input.readLine();
		// System.out.println("Hello, " + inputReader);
	}

	public void handle() throws IOException {

		System.out.println("I'm called");
		while(true) {
			if(in.hasNextLine()) {
				System.out.println(in.nextLine());
			}
			if (in.nextLine().equals("Bye")) {
				break;
			}

		}
	}

}
