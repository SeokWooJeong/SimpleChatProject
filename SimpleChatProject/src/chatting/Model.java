package chatting;

public class Model {

	private String NickName;
	private String port;
	private String IpAdress;

	public String getNickName() {
		return NickName;
	}

	public void setNickName(String nickName) {
		NickName = nickName;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getIpAdress() {
		return IpAdress;
	}

	public void setIpAdress(String ipAdress) {
		IpAdress = ipAdress;
	}

}
