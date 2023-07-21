package gr.aueb.cf.ch26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class DayTimeCli {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Socket socket = null;

        try {
//            InetAddress servAddress = InetAddress.getByName("time.nist.gov");
            InetAddress servAddress = InetAddress.getByName("127.0.0.1");
            int servPort = 1313; // port = 13

            socket = new Socket(servAddress, servPort);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = "";

            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            System.out.println("Daytime server says it is: " + sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           try {
               if (socket != null) socket.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
        }
    }
}
