import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            Socket socket = new Socket("localhost", 5000);

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            output.println("Hello Server!");

            String message = input.readLine();

            while (message != null && !"quit".equalsIgnoreCase(message.trim())) {

                System.out.println("Server: " + message);

                System.out.print("Enter message to send to server: ");
                String userMessage = sc.nextLine();

                output.println(userMessage);

                if ("quit".equalsIgnoreCase(userMessage.trim())) {
                    break;
                }

                message = input.readLine();
            }

            socket.close();
            sc.close();

            System.out.println("Client connection closed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}