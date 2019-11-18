package be.ac.umons.mom.g05.instance.mob;

import be.ac.umons.mom.g05.instance.mob.carasteristic.Caracteristic;
import be.ac.umons.mom.g05.instance.mob.carasteristic.Life;
import be.ac.umons.mom.g05.instance.mob.carasteristic.Mood;
import be.ac.umons.mom.g05.instance.object.*;

public class PC extends Mobile {
	private PCType type;
	Bag bag;                     // le sac du heros
	
	public PC(PCType type) {     // on cree le joueur selon le type au debut du jeu
		this.type = type;
		if(type ==PCType.Costaud) {
			Mood mood = new Mood();
			caract = new Caracteristic(0,0,8.0,5.0,6.0,mood);
			life = new Life(caract);
		}else if(type == PCType.Sportif) {
			Mood mood = new Mood();
			caract = new Caracteristic(0,0,6,8,5,mood);
			life = new Life(caract);
		}else if(type == PCType.Loser) {
			Mood mood = new Mood();
			mood.changemood(4);
			caract = new Caracteristic(0,0,4,4,4,mood);
			life = new Life(caract);
		}else if(type == PCType.Lambda) {
			Mood mood = new Mood();
			caract = new Caracteristic(0,0,6,6,6,mood);
			life = new Life(caract);
		}
	}
	
	public PC(PCType type, Caracteristic caract) {    // les caractristiques sont conservé lorsque il faut lancer le jeu genre il faut charger le jeu
		this.type = type;
		this.caract = caract;
		life = new Life(caract);
	}
	
	public void addlevel() {                          // normalement le moyen pour augmenter le niveau 
		caract.increaselevel();
	}
	
	public void takeobject(GameItem gameitem) {               // pour prendre les objets sur le sol ou lles objet que ob les donne les les mets sur les main que se soit arme ou qui que ce soit
		for(int i = 0;i < bodyitem.length;i++) {
			if(bodyitem[i] == null) {
				bodyitem[i] = gameitem;
				break;
			}
		}
	}
	
	public void give(NPC pnj, GameItem gameitem) {           // normaly the hero has to give things to a pnj or the pnj has to give the thing to 
		pnj.takeobject(gameitem);
	}
	
/*
 * addbag()
 * ce que ca va faire c'est ajouter dans le sac quelque chose
 * createbag() va creer le sac 
 * 
 */
}
