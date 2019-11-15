package be.ac.umons.mom.g05.instance.mob;

import java.util.ArrayList;

import be.ac.umons.mom.g05.instance.mob.carasteristic.Caracteristic;
import be.ac.umons.mom.g05.instance.mob.carasteristic.Life;
import be.ac.umons.mom.g05.instance.object.OBject;

public class Mobile{
	protected Caracteristic caract;
	protected Life life; // la vie
	protected String name; // le nom du module
	protected OBject[] obj = new OBject[4]; //pour l'instant �a va repreenter les differentes partie du corps au qeul on va ajouter les armures peut etre et on va ajouter les armes au personnage peut etre en creant
	public Mobile() {
		caract = new Caracteristic();
		life = new Life(caract);
		name = "people";
	}
	public Mobile(Caracteristic caract) {// pour ca il faut definir les caracteristique avant.
		this.caract = caract;
		life = new Life(caract);
		name = "people";
	}
	public void hit(Mobile mob) {
		// ici que il faut gerer les points le gain d'experience si le peresonnage meurt
	}
	
	protected void B(double p, double c) {
		return;
		// ca va servir pour frapper les enemies
		// mettre le fait que si la vie est � zero
	}
	// getter
	public String getname() {
		return name;
	}
	public Caracteristic getcaract() {
		return caract;
	}
	// setter
	public void setname(String str) {
		name = str;
	}
	
	/*
	 * ici il manque seuleument la methode pour tirer
	 * 
	 */
}
