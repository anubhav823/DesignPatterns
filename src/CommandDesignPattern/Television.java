package CommandDesignPattern;

public class Television implements ElectronicDevice {

	private int volume = 0;

	@Override
	public void on() {
		System.out.println("TV is on");
	}

	@Override
	public void off() {
		System.out.println("TV is off");
	}

	@Override
	public void volUp() {
		volume++;
		System.out.println("TV is on volume " + volume);
	}

	@Override
	public void volDown() {
		volume--;
		System.out.println("TV is on volume " + volume);
	}

}
