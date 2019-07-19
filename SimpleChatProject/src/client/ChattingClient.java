package client;

import java.net.ConnectException;
import java.net.Socket;

class ChattingClient {
   
   String ip="218.39.221.86"; // 입력해주고
   String name=""; 
   Socket socket;
   
   public ChattingClient(String[] args) {
      
      nameCheck(args);
      
      try {
         socket = new Socket(ip,4000);
         System.out.println("Server Connect!");
         Thread sender = new Thread(new ClientSender(socket,name));
//         Thread receiver = new Thread(new ClientReceiver(socket));
         
         sender.start();
//         receiver.start();
      }catch(ConnectException ce) {
         ce.printStackTrace();
      }catch(Exception e) {
         e.printStackTrace();
      }
   }
   
   public void nameCheck(String[] args) {
      if (args.length != 1) {
         System.out.println("대화명을 입력하세요");
         System.out.println("ex)java Main aaa");
         System.out.println("ex)java Main aaa");
         System.exit(0);
         
      }else {
         name = args[0];
      }
   }
}