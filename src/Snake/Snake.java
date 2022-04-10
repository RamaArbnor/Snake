package Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	
	public int x;
	public int y;
	
	public int oldX;
	public int oldY;
	
	public int width = 20;
	public int height = 20;
	
	public int direction = 6;
	public int oldDirection = direction;
	public Color color = Color.green;
	public int score;
	
	public int speed = 20;
	
	
	public Snake() {
		this.x = 20;
		this.y = 20;

	}
	
	public Snake(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.width, this.height);
	}
	
	public void tick() {
		
		if(direction == 6) {
//			System.out.println(oldX + " " + x);
			
			this.x += speed;
			this.oldX = x;
		}else if(direction == 4) {
			this.oldX = x;
			this.x -= speed;
		}else if(direction == 2) {
			this.oldY = y;
			this.y += speed;
		}else if(direction == 8) {
			this.oldY = y;
			this.y -= speed;
		}

		
		this.teleport();
		
	}
	
	public void teleport() {
		if(this.x == 780 && this.direction == 6) {
			this.x = -20;
		}else if (this.x == -20 && this.direction == 4) {
			this.x = 780;
		}else if (this.y == -20 && this.direction == 8) {
			this.y = 540;
		}else if (this.y == 560 && this.direction == 2) {
			this.y = -20;
		}
	}
	
}


