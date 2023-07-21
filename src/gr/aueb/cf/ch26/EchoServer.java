package gr.aueb.cf.ch26;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer extends Thread {
    @Override
    public void run() {
        ServerSocket servFd = null;
        final int serverPort = 2000; // port = 7
        try {
            servFd = new ServerSocket();
            servFd.bind(new InetSocketAddress("127.0.0.1", serverPort));
            System.out.println("Echo server started...");

            while (true) {
                Socket connectedFd = servFd.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(connectedFd.getInputStream()));
                PrintWriter pw = new PrintWriter(connectedFd.getOutputStream());
//                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connectedFd.getOutputStream()));
                String line = "";

                do {
                    line = br.readLine();
                    pw.println(line);
                    pw.flush();
                } while (!line.equals("BYE"));
                connectedFd.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (servFd != null) servFd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
