package chatting;

public class Model {

	private String NickName;
	private int port = 2300;
	private String IpAdress = "218.39.221.86";

	public String getNickName() {
		return NickName;
	}

	public void setNickName(String nickName) {
		NickName = nickName;
	}

	

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getIpAdress() {
		return IpAdress;
	}

	public void setIpAdress(String ipAdress) {
		IpAdress = ipAdress;
	}

}
