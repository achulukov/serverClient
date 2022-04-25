import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8090;

        try(Socket socket = new Socket(host, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            out.println("Andrey");

            String resp = in.readLine();

            System.out.println(resp);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
