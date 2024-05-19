package me.ba6tati.main;

import java.awt.Graphics;
import java.util.LinkedList;

//update objects
public class Handler {
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public void tick() {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}   
	
	public void render(Graphics g) {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}
	
	//adding object
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	//remove object
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}
}
