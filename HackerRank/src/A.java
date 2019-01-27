class Robot {
	int currentX;
	int currentY;
	int previousX;
	int previousY;
	boolean lastIsXMove;
	int lastX;
	int lastY;

	Robot() {
		currentX = 0;
		currentY = 5;
		previousX = 0;
		previousY = 5;
	}

	Robot(int x, int y) {
		currentX = x;
		currentY = y;
		previousX = 0;
		previousY = 5;
	}

	void moveX(int dx) {
		previousX = currentX;
		previousY = currentY;
		currentX += dx;
		lastIsXMove = true;
		lastX = dx;
	}

	void moveY(int dy) {
		previousX = currentX;
		previousY = currentY;
		currentY += dy;
		lastIsXMove = false;
		lastY = dy;
	}

	void printCurrentCoordinates() {
		System.out.println(currentX + " " + currentY);
	}

	void printLastCoordinates() {
		System.out.println(previousX + " " + previousY);
	}

	void printLastMove() {
		if (lastIsXMove)
			System.out.println("x" + " " + lastX);
		else
			System.out.println("y" + " " + lastY);
	}

}
