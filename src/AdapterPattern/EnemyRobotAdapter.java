package AdapterPattern;

public class EnemyRobotAdapter implements EnemyAttacker {

	EnemyRobot enemyRobot;

	public EnemyRobotAdapter(EnemyRobot enemyRobot) {
		this.enemyRobot = enemyRobot;
	}

	@Override
	public String fireWeapon() {
		return enemyRobot.smashWithHands();
	}

	@Override
	public String driveForward() {
		return enemyRobot.walkForward();
	}

	@Override
	public String assignDriver(String humanName) {
		return enemyRobot.reactToHuman(humanName);
	}

}
