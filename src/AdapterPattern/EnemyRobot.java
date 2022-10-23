package AdapterPattern;

public class EnemyRobot {

	public String smashWithHands() {
		return "Robot attacks with hands";
	}

	public String walkForward() {
		return "Robot moves forward";
	}

	public String reactToHuman(String humanName) {
		return "Robot smashes human with hands";
	}
}
