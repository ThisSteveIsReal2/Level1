import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Houses {
public static void main(String[] args) {
	
	//int Small = 80;
	//int Medium = 120;
	//int Large = 250;	
	Tortoise.setY(435);
	Tortoise.setX(10);
	//for (int i = 0; i < 10; i++) {
	//DrawHouse();
	//Height+=10;
	//}
    Tortoise.show();
    
	
}

private static void DrawHouse(String Height) {
	int GK = 0;
if(Height.equalsIgnoreCase("small")){
    	GK = 80;
    }
if(Height.equalsIgnoreCase("Medium")){
	
}
	Tortoise.setPenColor(Color.black);
	Tortoise.setSpeed(10);
	Tortoise.penDown();
	Tortoise.move(GK);
	Tortoise.setAngle(90);
	Tortoise.move(50);
	Tortoise.setAngle(180);
	Tortoise.move(GK);
	Tortoise.setAngle(90);
	Tortoise.setPenColor(Color.green);
	Tortoise.move(50);
	Tortoise.setAngle(0);
}	
}
