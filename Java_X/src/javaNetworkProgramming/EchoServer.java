package javaNetworkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		try {
			ServerSocket servSocket = new ServerSocket(5000);
			System.out.println("//Output of EchoServer.java file");
			System.out.println("Connecting to the Client...");

			Socket socket = servSocket.accept();
			System.out.println("Successfully Connected!");

			// Creating Input / Output streams
			InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());

			// reader and writer are I/O objects, use to communicate and send data to and
			// fro.
			BufferedReader reader = new BufferedReader(inputStreamReader);
			PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

			String input;
			while ((input = reader.readLine()) != null) {
				System.out.println("Client:" + input);
				writer.println(input);
			}

			writer.close();
			reader.close();
			socket.close();
			servSocket.close();

		} catch (IOException e) {
			System.out.println("Error is comming: " + e.getMessage());
		}
	}
}
