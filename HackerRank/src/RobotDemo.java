
public class RobotDemo {

	public static void main(String[] args) {
		Robot b = new Robot(2,1);
		b.moveX(1);
		b.printLastMove();
		b.printCurrentCoordinates();
		b.moveY(1);
		b.printLastCoordinates();
		b.printCurrentCoordinates();
		b.printLastCoordinates();
	}

}
