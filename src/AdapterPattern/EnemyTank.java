package AdapterPattern;

public class EnemyTank implements EnemyAttacker {

	@Override
	public String fireWeapon() {
		return "Enemy tank fires weapons";
	}

	@Override
	public String driveForward() {
		return "Enemy tank moves forward";
	}

	@Override
	public String assignDriver(String humanName) {
		return humanName + " is driving the tank";
	}

}
