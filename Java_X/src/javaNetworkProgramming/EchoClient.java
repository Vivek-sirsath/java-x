package javaNetworkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {

		try {
			System.out.println("//Output of EchoClient.java file");
			System.out.println("Connecting to Server...");

			Socket socket = new Socket("192.168.1.7", 5000);
			System.out.println("Successfully Connected!");

			// Create Input / Output streams
			InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());

			// reader and writer are I/O objects, use to communicate and send data to and
			// fro.
			BufferedReader reader = new BufferedReader(inputStreamReader);
			PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

			// NOTE:- Here we can use Scanner class as well to accept the user input.
			Scanner scanner = new Scanner(System.in);

			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));

			// Implementing the methods to exchange data

			String userInput;
			System.out.println("Type Message: ");
/*			while ((userInput = stdReader.readLine()) != null) {

				writer.println(userInput);
				System.out.println("Server: " + reader.readLine());
			}
*/
			
// Commented because port PID 5000 will be running continuously
			
			socket.close();
			scanner.close();
			reader.close();
			writer.close();
			

		} catch (IOException e) {
			System.out.println("Error is comming: " + e.getMessage());
		}

	}

}
