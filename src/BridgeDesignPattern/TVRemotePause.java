package BridgeDesignPattern;

public class TVRemotePause extends RemoteButton{

	public TVRemotePause(EntertainmentDevice device) {
		super(device);
	}
	
	@Override
	public void buttonNinePressed() {
		System.out.println("TV was paused");
	}

	
}
