package be.ac.umons.mom.g05.instance.mob.carasteristic;

public class Life {
	private int HP;
	private double currentlife;
	private Caracteristic caract;
	
	public Life(Caracteristic caract) {
		this.caract = new Caracteristic();
		HP = (int)caract.getstrength() * 20;
		currentlife = HP;
	}
	
	public int getHP() {
		return HP;
	}
	public double getcurrentlife() {
		return currentlife;
	}
	public void changelife(double newlife) {
		currentlife = newlife;
	}
	
	public void changeHP() {// pour la vie Max
		HP = (int)caract.getstrength() * 20;
	}
	
}
