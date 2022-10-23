package CommandDesignPattern;

public class PlayWithRemote {
	public static void main(String[] args) {
		ElectronicDevice device = TVRemote.getDevice();
		TurnTVOn onCommand = new TurnTVOn(device);
		TurnTVOff tvOffCommand = new TurnTVOff(device);
		TurnVolUp volUpCommand = new TurnVolUp(device);
		TurnVolDown volDownCommand = new TurnVolDown(device);

		DeviceButton onPressed = new DeviceButton(volDownCommand);
		onPressed.press();
	}
}
