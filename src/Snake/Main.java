package Snake;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.Color;

import setup.Manager;
import setup.Window;
import setup.WindowTest;

import java.util.ArrayList;
import java.util.Random;

public class Main implements Manager{
	
	public static final int WIDTH = 800, HEIGHT = 600, FPS = 15, TPS = 60;
	
	static Random random = new Random();
//	static int x = (int)(Math.random()*40)*20;
//	static int y = (int)(Math.random()*30)*20;
	
	static ArrayList<Body> body = new ArrayList<Body>();
	static Food food = new Food(20, 20, Color.RED);
	static Snake snake = new Snake();
	static Body body1 = new Body(snake.x, snake.x);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(x + " " + y);
		
		body.add(body1);
		@SuppressWarnings("unused")
		Window wind = new Window(WIDTH, HEIGHT, FPS, TPS, "Snake", new Main());
		
//		Food food = new Food(10, 10, 20, 20, Color.RED);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		if(food.x == snake.x && food.y == snake.y) {
			food.reGen(snake, body);
		}
		
		for(int i = 0; i < body.size(); i++) {
			body.get(i).draw(g);
		}

		food.draw(g);
		snake.draw(g);
//		body1.draw(g);
		for(int i = 1; i < body.size(); i++) {
			body.get(i).draw(g);
		}
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
		food.tick();
		snake.tick();
		body1.tick(snake, body);
		body1.x = snake.x;
		body1.y = snake.y;
		for(int i = 1; i < body.size(); i++) {
			body.get(i).tick(snake, body);
		}
//		System.out.println(body.get(0) + " " + snake.x + " tick");
//		body.get(body.size()-1).x = body.get(body.size()-2).x;
//		body.get(body.size()-1).y = body.get(body.size()-2).y;
		
		
		
//		for(int i = 1;i < body.size(); i++) {
//			body.get(i).x = body.get(i-1).oldX;
//			body.get(i).y = body.get(i-1).oldY;
//		}
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(int e) {
		// TODO Auto-generated method stub
		if(e == KeyEvent.VK_UP) {
			snake.oldDirection = snake.direction;
	        snake.direction = 8;
		}else if(e == KeyEvent.VK_DOWN) {
			snake.oldDirection = snake.direction;
			snake.direction = 2;
		}else if(e == KeyEvent.VK_LEFT) {
			snake.oldDirection = snake.direction;
			snake.direction = 4;
		}else if(e == KeyEvent.VK_RIGHT) {
			snake.oldDirection = snake.direction;
			snake.direction = 6;
		}else if(e == KeyEvent.VK_SPACE) {
			System.out.println(".::---------------------------------------::.");
			System.out.println("Body size" + body.size());
			System.out.println("snake x = " + snake.x + " snake y = " + snake.y);
			System.out.println("snake oldX = " + snake.oldX + " snake oldY = " + snake.oldY);
			System.out.println("the last on body x and y " + body.get(body.size()-1).x + " " + body.get(body.size()-1   ).y);
		}else if(e == KeyEvent.VK_W) {
			body.get(0).y += 20;
		}
	}

	@Override
	public void keyReleased(int e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(int e) {
		// TODO Auto-generated method stub
		
	}

}
