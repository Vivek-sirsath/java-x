package javaNetworkProgramming;

import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {

		try {
			System.out.println("//Output of Client.java file");
		System.out.println("Connecting to Server...");
		
		Socket socket = new Socket("192.168.1.7", 5000);
		System.out.println("Successfully Connected!");
				
			socket.close();
			
		} catch (IOException e) {
			System.out.println("Error is comming: " + e.getMessage());
		}

	}

}
