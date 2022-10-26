package BridgeDesignPattern;

public class TVRemoteMute extends RemoteButton{

	public TVRemoteMute(EntertainmentDevice device) {
		super(device);
	}
	
	@Override
	public void buttonNinePressed() {
		System.out.println("TV was muted");
	}

	
}
