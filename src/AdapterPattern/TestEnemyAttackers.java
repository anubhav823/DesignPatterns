package AdapterPattern;

public class TestEnemyAttackers {
	public static void main(String[] args) {
		EnemyTank tank = new EnemyTank();
		EnemyRobot fred = new EnemyRobot();
		EnemyRobotAdapter adapter = new EnemyRobotAdapter(fred);
		
		System.out.println("Tank");
		System.out.println(tank.driveForward());
		System.out.println(tank.assignDriver("George"));
		System.out.println(tank.fireWeapon());
		
		System.out.println("Without adapter");
		System.out.println(fred.walkForward());
		System.out.println(fred.reactToHuman("George"));
		System.out.println(fred.smashWithHands());
		
		System.out.println("With adapter");
		System.out.println(adapter.driveForward());
		System.out.println(adapter.assignDriver("George"));
		System.out.println(adapter.fireWeapon());
	}
}
