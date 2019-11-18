package be.ac.umons.mom.g05.instance.mob;

import be.ac.umons.mom.g05.instance.object.GameItem;

public class NPC extends Mobile {       // les pnj sont de type spécifique 
	private NPCType type;
	public NPC() {
		
	}
	public void takeobject(GameItem gameitem) { // la même methode que pour le player selon le type de personnage il aura un sac
		for(int i = 0;i < bodyitem.length;i++) {
			if(bodyitem[i] == null) {
				bodyitem[i] = gameitem;
				break;
			}
		}
	}
	
	public void give(PC player, GameItem obj) {
		player.takeobject(obj);
	}
}
