/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.zuccante.pop3fxclient;

import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class Pop3Client {

    private final InetAddress server;
    private final int port;

    private final String User;
    private final String Pass;

    private Socket s;
    private BufferedReader input;
    private PrintWriter out;

    /**
     *
     * @throws java.net.UnknownHostException
     */
    public Pop3Client() throws UnknownHostException {
        server = InetAddress.getByName("192.168.4.250");
        port = 110;

        User = "s.mattiello";
        Pass = "alfa";
    }

    /**
     *
     * @return true if pop3 connection completed
     * @throws java.io.IOException
     */
    public boolean connect() throws IOException {
        boolean isConnected = false;

        s = new Socket(server, port);

        input = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out = new PrintWriter(s.getOutputStream(), true);

        String answer = input.readLine();
        if (answer.contains("+OK")) {
            out.println("USER " + User);
            answer = input.readLine();

            if (answer.contains("+OK")) {
                out.println("PASS " + Pass);
                answer = input.readLine();
                if (answer.contains("+OK")) {
                    isConnected = true;
                }
            }
            
        }
        return isConnected;
    } // connect()
    

    /**
     * 
     * @return 
     * @throws java.io.IOException 
     */
    public int getNumOfMessages() throws IOException {
        int num = 0;
        
        String answer;
        String command = "STAT";
        
        out.println(command);
        
        answer = input.readLine(); // Dovrebbe essere +OK nn mmmm
        if (answer.contains("+OK")) {
                     num = Integer.parseInt(answer.split(" ")[1]);
        }
        return num;
    }

}
