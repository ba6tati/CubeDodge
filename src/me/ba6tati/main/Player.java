package me.ba6tati.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject{
	
	Random r = new Random();
	Handler handler;

	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler; 
		
	}
	
	//setting the size of the collision
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}

	public void tick() {
		// TODO Auto-generated method stub
		x += velX;
		y += velY;
		
		//invisible wall
		x = Game.clamp(x, 0, Game.WIDTH - 37);
		y = Game.clamp(y, 0, Game.HEIGHT - 60);
		
		collision();
	}
	
	private void collision() {
		//easiest loop
		for(int i = 0; i < handler.object.size(); i++) {
			//craete game object
			GameObject tempObject = handler.object.get(i);
			
			//if our object is Basic Enemy
			if(tempObject.getId() == ID.BasicEnemy) {
				//ako se zasekat 
				if(getBounds().intersects(tempObject.getBounds())) {
					//get health
					HUD.HEALTH -= 2;
				}
				
			}
		}
	}

	public void render() {
		// TODO Auto-generated method stub
		
	}

	public void render(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}

}
