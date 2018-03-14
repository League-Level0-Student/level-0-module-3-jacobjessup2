package loops;

import org.jointheleague.graphical.robot.Robot;

public class ObidientRobot {
	static Robot Muda = new Robot();
public static void main(String[] args) {
	Muda.setSpeed(20);
	Muda.penDown();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	public static void square(){
		for (int i = 0; i < 4; i++) {
		Muda.move(100);
		Muda.turn(360/4);
		}
	}
public static void triangle() {	
	for (int i = 0; i < 3; i++) {
	
	Muda.move(100);
	Muda.turn(180/3);
	}
}
	
	
	
	
	

}
