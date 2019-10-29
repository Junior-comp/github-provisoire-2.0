package be.ac.umons.mom.g05.mob.carasteristic;

public class Caracteristic {
	private double strength;
	private double agility;
	private double defense;
	private Mood mood;
	private double speed = 0.0;
	private int level;
	private double XP =0;
	public Caracteristic() {
		level = 0;
	}
	public Caracteristic(int level,int XP, double strength, double agility,double defense, Mood mood) {
		this.level = level;
		this.XP = XP;
		this.strength = strength;
		this.agility = agility;
		this.defense = defense;
		this.mood = mood;
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
	public void increaselevel() {
		if(XPMAX(level+1) == XP)
			level++;
	}
	
	public void setSpeed() {// pour la vitesse de deplacement
		speed = 2 + (agility/20.0);
	}
	
	
}
