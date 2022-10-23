package CommandDesignPattern;

public class TurnVolUp implements Command {

	ElectronicDevice device;

	public TurnVolUp(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volUp();
	}
}
