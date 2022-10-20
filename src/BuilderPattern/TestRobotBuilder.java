package BuilderPattern;

public class TestRobotBuilder {
	public static void main(String[] args) {
		RobotBuilder builder = new OldRobotBuilder();
		RobotEngineer engineer = new RobotEngineer(builder);
		engineer.makeRobot();
		Robot robot = engineer.getRobot();
		System.out.println(robot.toString());
		
		RobotBuilder newBuilder = new NewRobotBuilder();
		RobotEngineer newEngineer = new RobotEngineer(newBuilder);
		newEngineer.makeRobot();
		robot = newEngineer.getRobot();
		System.out.println(robot.toString());
	}
}
