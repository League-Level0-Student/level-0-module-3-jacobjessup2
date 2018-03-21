package loops;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObidientRobot {
	static Robot Muda = new Robot();
public static void main(String[] args) {
	Muda.setSpeed(20);
	Muda.penDown();
	
	String shape=JOptionPane.showInputDialog("What shape do you want to make?");
	
	if(shape.equals("square")) {
	square();
	}
	if(shape.equals("triangle")) {
		triangle();
		}
	if(shape.equals("circle")) {
		circle();
		}
	
	
}
	public static void square(){
		for (int i = 0; i < 4; i++) {
		Muda.move(100);
		Muda.turn(360/4);
		}
	}
public static void triangle() {	
	Muda.setAngle(-90);
	for (int i = 0; i < 3; i++) {
		Muda.turn(360/3);
	Muda.move(100);
	
	}
}
	public static void circle() {
		for (int i = 0; i < 360; i++) {
			Muda.move(1);
			Muda.turn(360/360);
		}
	}
	
	
	
	

}
