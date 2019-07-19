package client;

import java.io.DataInputStream;
import java.net.Socket;

class ClientReceiver extends Thread {
   Socket socket;
   DataInputStream in;
   
   ClientReceiver(Socket socket){
      this.socket=socket;
      try {
         in = new DataInputStream(socket.getInputStream());
      }catch(Exception e) {
         e.printStackTrace();
      }
   }
   
   public void run() {
      while(in!=null) {
         try {            
            System.out.println(in.readUTF());
         }catch(Exception e) {
            e.printStackTrace();
         }
      }
   }
}