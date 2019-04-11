
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends JFrame implements Runnable {
    static private Socket connection;
    static private ObjectOutputStream outputStream;
    static private ObjectInputStream inputStream;

    public static void main(String[] args) {
        new Thread(new Server()).start();
        new Thread(new Client("Chat")).start();
    }

    public Client(String name) {
        super(name);
        setLayout(new FlowLayout());
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        final JTextField jTextField = new JTextField(10);
        final JButton jButtonSend = new JButton("Send");
        jButtonSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jButtonSend) {
                    try {
                        sentData(jTextField.getText());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        add(jTextField);
        add(jButtonSend);
        setVisible(true);

    }

    @Override
    public void run() {
        try {
            while (true) {
                connection = new Socket(InetAddress.getByName("127.0.0.1"), 5600);
                outputStream = new ObjectOutputStream(connection.getOutputStream());
                inputStream = new ObjectInputStream(connection.getInputStream());
                JOptionPane.showMessageDialog(null, inputStream.readObject().toString());
            }
        } catch (UnknownHostException e) {
            System.out.println("Host error");
        } catch (ClassNotFoundException e) {
            System.out.println("Class error");
        } catch (IOException e) {
            System.out.println("IOException");
        }


    }

    private static void sentData(Object object) throws IOException {
        outputStream.flush();
        outputStream.writeObject(object);
    }
}
