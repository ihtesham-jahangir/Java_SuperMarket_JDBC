/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {

    private Socket socket;
    
    public Client() {
        try {
            socket = new Socket("localhost", 4444);
        } catch (IOException ex) {} 
    }
    
    public void sendMessage(String msg) {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 
            System.out.println(msg);
            out.println(msg);
        } catch(IOException ex) {}
    }
}