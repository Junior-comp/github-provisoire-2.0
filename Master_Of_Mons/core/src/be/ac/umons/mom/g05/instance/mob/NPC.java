package be.ac.umons.mom.g05.instance.mob;

import be.ac.umons.mom.g05.instance.object.OBject;

public class NPC extends Mobil {// les pnj sont de type spécifique 
	private NPCType type;
	public NPC() {
		
	}
	public void takeobject(OBject ob) { // la même methode que pour le player selon le type de personnage il aura un sac
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
