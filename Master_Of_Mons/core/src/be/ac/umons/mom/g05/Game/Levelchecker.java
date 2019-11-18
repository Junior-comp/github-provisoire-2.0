package be.ac.umons.mom.g05.Game;

import be.ac.umons.mom.g05.Game.Quest;

// ils representeront les diffferents niveau a passer et il y'aura donc 5 niveau a passer  le ba1 1 ba2 2 ba3 3 ma1 4 ma2 5

public class Levelchecker {
	private Quest[] quests;       // chaque niveau auront 2 quêtes 
	public Levelchecker(int i) {
		quests = new Quest[2];
		if(i == 1) {
			quests[0] = new Quest(1);
			quests[1] = new Quest(2);
		}else if(i == 2) {
			quests[0] = new Quest(3);
			quests[1] = new Quest(4);
		}else if(i == 3) {
			quests[0] = new Quest(5);
			quests[1] = new Quest(6);
		}else if(i == 4) {
			quests[0] = new Quest(7);
			quests[1] = new Quest(8);
		}else if(i == 5) {
			quests[0] = new Quest(9);
			quests[1] = new Quest(10);
		}
		else {
			System.err.println("nooooooo");
		}
	}
	
	public boolean levelfinished() {
		boolean res = true;
		for(Quest i:quests) {
			if(i.questfinished() == false)
				res = false;
		}
		return res;
	}
	
	public Quest[] getquests() {
		return quests;
	}

}
