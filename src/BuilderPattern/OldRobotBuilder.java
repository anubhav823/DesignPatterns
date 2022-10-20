package BuilderPattern;

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;

	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotArms("Bomb arms");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotTorso("Tin torso");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Tin legs");
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}
}
