package Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Food {
//	private Graphics g;
	public int x;
	public int y;
	public int width;
	public int height;
	public Color color;
	
	public Food(int width, int height, Color color) {
		
		this.x = (int)(Math.random()*36)*20;
		this.y = (int)(Math.random()*26)*20;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.width, this.height);
		
	}
	
	public void tick() {
//		this.x++;


//		System.out.print("\033[H\033[2J");
//        System.out.flush();
		
		
	}
	
	public void reGen(Snake s, ArrayList<Body> sL) {
		this.x = (int)(Math.random()*36)*20;
		this.y = (int)(Math.random()*26)*20;
		s.score++;
		int last = sL.size()-1;
		sL.add(new Body(sL.get(last).oldX, sL.get(last).oldY));
		System.out.println("Score : " + s.score);
		
	}
	
}
