package chatting;

import java.awt.EventQueue;

public class Controller {
	
	View_Chatting chat;
	View_Login login;	
	Model m;
	
	public Controller() {
		m = new Model();
	}
	
	public void openChat() {
		EventQueue.invokeLater( ()-> {			
			try {
				chat = new View_Chatting();
				chat.setController(Controller.this);
				chat.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	
	public void openLogin() {
		EventQueue.invokeLater(()-> {
			try {
				login = new View_Login();
				login.setController(Controller.this);
				login.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}			
		});
	}
	
	public void setNickname(String name) {
		m.setNickName(name);
	}
	
	public void setPort(String port) {
		m.setNickName(port);
	}
	
	public void setIpadress(String ip) {
		m.setNickName(ip);
	}
	
	public String getPort () {
		return m.getPort();
	}
	
	public String getNickname () {
		return m.getNickName();
	}
	
	public String getIpadress () {
		return m.getIpAdress();
	}
}
