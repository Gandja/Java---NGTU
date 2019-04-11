
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
    static private ServerSocket server;
    static private Socket connection;
    static private ObjectOutputStream outputStream;
    static private ObjectInputStream inputStream;

    @Override
    public void run() {
        try {
            server = new ServerSocket(5600, 10);

            while (true) {
                connection = server.accept();
                outputStream = new ObjectOutputStream(connection.getOutputStream());
                inputStream = new ObjectInputStream(connection.getInputStream());
                outputStream.writeObject("You sent: " + inputStream.readObject().toString());
            }
        } catch (IOException e) {
            System.out.println(("Error 3"));
        } catch (ClassNotFoundException e) {
            System.out.println("Error 4");
        }
    }
}
