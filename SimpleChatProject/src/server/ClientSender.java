import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

class ClientSender extends Thread {

   Socket socket=null;
   DataOutputStream out;
   InetAddress ip;
   int port;
   String name;
   
   ClientSender(Socket socket, String name){
      this.socket = socket;
      try {
         out = new DataOutputStream(socket.getOutputStream());
         ip = socket.getInetAddress();
         port = socket.getPort();
         this.name = name;
         
      }catch(Exception e) {
         e.printStackTrace();
      }
   }
   
   
   public void run() {
      Scanner scanner = new Scanner(System.in);
      try {
         if(out!=null) {
            out.writeUTF(name);
         }
         while(out!=null) {
            out.writeUTF("["+name+"]"+scanner.nextLine());
         }
      }catch(IOException e) {
         e.printStackTrace();
      }
      
   }
}