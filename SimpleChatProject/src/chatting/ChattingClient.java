package chatting;
import java.net.ConnectException;
import java.net.Socket;

class ChattingClient {

	String ip ; // 입력해주고

	String name = "";
	int socket;
	ClientSender clientSender;
	ClientReceiver clientReceiver;
	Controller controller;
	public ChattingClient(String name, String ip, int socket, Controller controller) {
		
	
		this.ip = ip;
		this.socket = socket;
		this.controller = controller;
		try {
			Socket s = new Socket(this.ip, this.socket);
			System.out.println("Server Connect!");
			clientSender = new ClientSender(s, name);
			clientReceiver = new ClientReceiver(s, this);
			Thread receiver = new Thread(clientReceiver);

			receiver.start();
		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void sendLog(String log) {
		clientSender.run(log);
	}
	
	public void getLog(String log) {
		controller.getLog(log);
	}

	
}