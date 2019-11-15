package be.ac.umons.mom.g05.instance.mob.caracteristic;
// les caracteristiques geret tout les trucs de force agilite humeur de la personne mais je ne sais pas si il faut que j'enleve l'humeur

import be.ac.umons.mom.g05.instance.mob.caracteristic.Mood;

public class Caracteristic {
	private double strength;
	private double agility;
	private double defense;
	private Mood mood;
	private double speed;
	private int level;
	private double XP =0;
	public Caracteristic() {
		level = 0;
		XP = 0;
		strength = 3;
		agility = 3;
		defense = 3;
		mood = new Mood();
		setSpeed();
	}
	public Caracteristic(int level,int XP, double strength, double agility,double defense, Mood mood) {
		this.level = level;
		this.XP = XP;
		this.strength = strength;
		this.agility = agility;
		this.defense = defense;
		this.mood = mood;
		setSpeed();
	}
	public double getstrength() {
		return strength;
	}
	public double getagility() {
		return agility;
	}
	public double getdefense() {
		return defense;
	}
	public double getXP() {
		return XP;
	}
	public int getlevel() {
		return level;
	}
	public Mood getMood() {
		return mood;
	}
	public double XPMAX(int level) {// le nombre de XP pour atteindre ce niveau
		if(level <= 1) {
			return 0;
		}
		else {
			return (XPMAX(level-1)+ 1000*Math.pow(1.1, level-1));
		}
	}
	
	public void increaselevel() {// augmenter le niveau du person
		if(XPMAX(level+1) == XP)
			level++;
	}
	
	public void setSpeed() {// pour la vitesse de deplacement
		speed = 2 + (agility/20.0);
	}
	
	/*
	 * la periode d'une attaque physique c
	 */
	public String toString() {// ceci est seulement pour montrer les caracteristiques
		return "strength = "+strength+"  agility = "+agility+ "  defense = "+defense+"  speed = "+speed;
	}
	
	public void reinit() {// ap avoir vu comment remettre les truc en ordre on va rajouter le nombre a moins que ce ne soit pas necessaire
		
	}
}
