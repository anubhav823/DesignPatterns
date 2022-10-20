package BuilderPattern;

public class NewRobotBuilder implements RobotBuilder {

		private Robot robot;

		/**
		 * 
		 */
		public NewRobotBuilder() {
			this.robot = new Robot();
		}

		@Override
		public void buildRobotHead() {
			robot.setRobotHead("Titanium head");
			
		}

		@Override
		public void buildRobotTorso() {
			robot.setRobotTorso("Stealth Torso");
		}

		@Override
		public void buildRobotArms() {
			robot.setRobotArms("Nunchucks");
		}

		@Override
		public void buildRobotLegs() {
			robot.setRobotLegs("Wheels");
		}

		@Override
		public Robot getRobot() {
			return this.robot;
		}

}
