
/*
 * 1) ServerSocket class of java.net package used to obtain port and listen client requests.
 * 2) accept() method is called by the server to validate incoming request to the socket.
 *    this method returns a socket object of Socket Class.
 *    After accepting, Server gets new object 'socket' bound to same local port '5000' 
 *    
 * 
 * */


package javaNetworkProgramming;

import java.io.IOException;
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

			socket.close();
			servSocket.close();

		} catch (IOException e) {
			System.out.println("Error is comming: " + e.getMessage());
		}

	}

}
