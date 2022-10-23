package CommandDesignPattern;

public class DeviceButton {

	Command command;
	
	public DeviceButton(Command newCommand) {
		command = newCommand;
	}
	
	public void press() {
		command.execute();
	}
}
