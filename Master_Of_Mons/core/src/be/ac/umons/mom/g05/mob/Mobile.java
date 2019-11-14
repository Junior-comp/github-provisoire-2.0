package be.ac.umons.mom.g05.mob;

import java.util.ArrayList;

import be.ac.umons.mom.g05.*;
import be.ac.umons.mom.g05.mob.carasteristic.*;

public abstract class Mobile implements Interaction {
	private Caracteristic caract;
	private Life life;
	public String name;
	public ArrayList<String> lwords = new ArrayList();
	public Object[] body = new Object[4]; // The collection of object that the player can carry 
	
	public Mobile() {
		caract = new Caracteristic();
		life = new Life(caract);
		name = "Gaetant Staquet";
		
	}
	public Mobile(String name,Life life, Caracteristic caract) {
		this.name = name;
		this.life = life;
		this.caract = caract;
	}
	
	public String speak(Mobile mob) {
		return ("wath's up bro ?");
	}
	public String speak(Mobile mob, String swords) {
		return(swords);
	}
	
	public void listen(Mobile mob) {
		mob.speak(this);
	}
	
	public void hit(Mobile mob) {
		// ici que il faut gerer les points le gain d'experience si le peresonnage meurt
	}
}
