import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatServer {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            Socket socket = serverSocket.accept();

            System.out.println("Client connected.");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            String message = input.readLine();

            System.out.println("Client: " + message);

            while (message != null && !"quit".equalsIgnoreCase(message.trim())) {

                System.out.print("Enter message to send to client: ");
                String userMessage = sc.nextLine();

                output.println(userMessage);

                if ("quit".equalsIgnoreCase(userMessage.trim())) {
                    break;
                }

                message = input.readLine();
                System.out.println("Client: " + message);
            }

            socket.close();
            serverSocket.close();
            sc.close();

            System.out.println("Server connection closed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}