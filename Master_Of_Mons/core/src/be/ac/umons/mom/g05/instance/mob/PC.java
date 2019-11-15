package be.ac.umons.mom.g05.instance.mob;

import be.ac.umons.mom.g05.instance.mob.caracteristic.*;
import be.ac.umons.mom.g05.instance.object.*;
enum Type{Costaud, Sportif, Loser, Lambda}// les trait du heros que l'on a besoin
public class PC extends Mobil {
	private Type type;
	final Level[] quests = { new BA1(),new BA2(), new BA3(),new MA1(), new MA2()}; // ca pourrait se changer en final hein
	Bag bag;// le sac du heros
	
	public PC(Type type) { // on cree le joueur selon le type au debut du jeu
		this.type = type;
		if(type ==Type.Costaud) {
			Mood mood = new Mood();
			caract = new Caracteristic(0,0,8.0,5.0,6.0,mood);
			life = new Life(caract);
		}else if(type == Type.Sportif) {
			Mood mood = new Mood();
			caract = new Caracteristic(0,0,6,8,5,mood);
			life = new Life(caract);
		}else if(type == Type.Loser) {
			Mood mood = new Mood();
			mood.changemood(4);
			caract = new Caracteristic(0,0,4,4,4,mood);
			life = new Life(caract);
		}else if(type == Type.Lambda) {
			Mood mood = new Mood();
			caract = new Caracteristic(0,0,6,6,6,mood);
			life = new Life(caract);
		}
	}
	
	public PC(Type type, Caracteristic caract) {// les caractristiques sont conservé lorsque il faut lancer le jeu genre il faut charger le jeu
		this.type = type;
		this.caract = caract;
		life = new Life(caract);
	}
	
	public void addlevel() {// normalement le moyen pour augmenter le niveau 
		caract.increaselevel();
	}
	
	public void takeobject(OBject ob) {// pour prendre les objets sur le sol ou lles objet que ob les donne les les mets sur les main que se soit arme ou qui que ce soit
		for(int i = 0;i < obj.length;i++) {
			if(obj[i] == null) {
				obj[i] = ob;
				break;
			}
		}
	}
	
	public void give(NPC pnj, OBject obj) { // normaly the hero has to give things to a pnj or the pnj has to give the thing to 
		pnj.takeobject(obj);
	}
	
/*
 * addbag()
 * ce que ca va faire c'est ajouter dans le sac quelque chose
 * createbag() va creer le sac 
 * 
 */
}
