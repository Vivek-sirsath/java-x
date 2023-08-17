
/*
 * 1) ServerSocket class of java.net package used to obtain port and listen client requests.
 * 2) accept() method is called by the server to validate incoming request to the socket.
 *    this method returns a socket object of Socket Class.
 *    After accepting, Server gets new object 'socket' bound to same local port '5000' 
 * 
 */


package javaNetworkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		try {
			ServerSocket servSocket = new ServerSocket(5000);
			System.out.println("//Output of Server.java file");
			System.out.println("Connecting to the Client...");
			
			Socket socket = servSocket.accept();
			System.out.println("Successfully Connected!");
			
			// Creating I/O streams
			InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
			
			// reader and writer are I/O objects, use to communicate and send data to and fro.
			BufferedReader reader = new BufferedReader(inputStreamReader);
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
			
			// Implementing methods to exchange data
			String input = reader.readLine();
			System.out.println("Client: " + input);
			writer.println("Hello, " + input);
			
			writer.close();
			reader.close();
			socket.close();
			servSocket.close();

		} catch (IOException e) {
			System.out.println("Error is comming: " + e.getMessage());
		}

	}

}
