/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Administrator
 */
public class Server {

    private ServerSocket serverSocket;
    
    public Server() {
        try {
            serverSocket = new ServerSocket(4444); 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void start() {
        while(true) {
            try {
                Socket socket = serverSocket.accept();
                
                //handle client
            } catch(IOException ex) {}
        }
    }

}
