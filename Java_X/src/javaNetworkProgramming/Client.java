package javaNetworkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {

		try {
			System.out.println("//Output of Client.java file");
		System.out.println("Connecting to Server...");
		
		Socket socket = new Socket("192.168.1.7", 5000);
		System.out.println("Successfully Connected!");
		
		// Create I/O streams
		InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
		
		// reader and writer are I/O objects, use to communicate and send data to and fro.
		BufferedReader reader = new BufferedReader(inputStreamReader);
		
		PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
		
		// Create the standard input stream to accept the user input from keyboard.
		BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
		// NOTE:- Here we can use Scanner class as well to accept the user input.
		
		// Implementing the methods to exchange data
		System.out.println("Hey, please enter your name:");
		String userInput = stdReader.readLine();
		writer.println(userInput);
		System.out.println("Server: " + reader.readLine());
			
		reader.close();
		writer.close();
		socket.close();
			
		} catch (IOException e) {
			System.out.println("Error is comming: " + e.getMessage());
		}

	}

}
