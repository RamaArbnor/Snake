package Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Body {
	 public int x;
	 public int y;
	 public int oldX;
	 public int oldY;
	 public int direction;
	 public int oldDirection;
	 public int width = 20;
	 public int height = 20;
	 public Color color = Color.WHITE;
	 
	 public Body(int x, int y) {
		 this.x = x;
		 this.y = y;
	 }
	 
	 public void draw(Graphics g) {
		 g.setColor(this.color);
		 g.fillRect(this.x, this.y, this.width, this.height);
		
	 }
	 
	 public void tick(Snake snake ,ArrayList<Body> body) {
		 this.oldX = x;
		 this.oldY = y;
		 for(int i = 1; i < body.size(); i++) {
			 if(body.get(i).equals(this) && i != 0) {
				 this.x = body.get(i-1).oldX;
				 this.y = body.get(i-1).oldY;
			 }
			 if(body.get(0).x == body.get(i).x && body.get(0).y == body.get(i).y) {
				 body.get(0).color = Color.red;
//				 System.out.println("Fail");
				 snake.speed = 0;
			 }
		 }
		 
		 
//		 this.x = body.get(body.size()-1).oldX;
//		 this.y = body.get(body.size()-1).oldY;
//		 System.out.println(body.get(0).oldX + " " + body.get(0).oldY + " body tick");
	 }
	 
	 


}
