package CommandDesignPattern;

public class TurnVolDown implements Command{
	
	ElectronicDevice device;

	public TurnVolDown(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volDown();
	}
}
