package setup;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import setup.Manager;
import setup.Window;

public class WindowTest implements Manager{
	
	public static final int WIDTH = 800, HEIGHT = 600, FPS = 60, TPS = 60;
	
	int boxX = 20;
	
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.setColor(Color.RED);
		g.fillRect(boxX, 100, 100, 100);
	}
	
	public void tick() {
		boxX++;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Window wind = new Window(WIDTH, HEIGHT, FPS, TPS, "Window Title", new WindowTest());
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
