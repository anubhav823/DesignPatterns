package BridgeDesignPattern;

public class TVRemoteTest {
	public static void main(String[] args) {
		RemoteButton tvRemoteButton = new TVRemoteMute(new TVDevice(1, 2));
		RemoteButton tvRemotePause = new TVRemotePause(new TVDevice(1, 2));
		System.out.println("TEST with mute");
		tvRemoteButton.buttonFivePressed();
		tvRemoteButton.buttonSixPressed();
		tvRemoteButton.buttonNinePressed();
		tvRemoteButton.deviceFeedback();
		
		System.out.println("TEST with pause");
		tvRemotePause.buttonFivePressed();
		tvRemotePause.buttonSixPressed();
		tvRemotePause.buttonNinePressed();
		tvRemotePause.deviceFeedback();
	}
}
