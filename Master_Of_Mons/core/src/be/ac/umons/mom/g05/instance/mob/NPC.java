package be.ac.umons.mom.g05.instance.mob;

import be.ac.umons.mom.g05.instance.object.OBject;

public class NPC extends Mobile {// les pnj sont de type sp�cifique
	public enum Type{Boss, Student, Enemies}// les different type de pnj comme il faut pas creer des 
	
	public void takeobject(OBject ob) { // la m�me methode que pour le player selon le type de personnage il aura un sac
		for(int i = 0;i < obj.length;i++) {
			if(obj[i] == null) {
				obj[i] = ob;
				break;
			}
		}
	}
	
	public void give(PC player, OBject obj) {
		player.takeobject(obj);
	}
}
