package be.ac.umons.mom.g05.instance.mob;

import java.util.ArrayList;

import be.ac.umons.mom.g05.*;
import be.ac.umons.mom.g05.instance.mob.caracteristic.Caracteristic;
import be.ac.umons.mom.g05.instance.mob.caracteristic.Life;
import be.ac.umons.mom.g05.instance.object.OBject;
import be.ac.umons.mom.g05.instance.mob.caracteristic.*;

public class Mobil{
	protected Caracteristic caract;
	protected Life life; // la vie
	protected String name; // le nom du module
	protected OBject[] obj = new OBject[4]; //pour l'instant ça va repreenter les differentes partie du corps au qeul on va ajouter les armures peut etre et on va ajouter les armes au personnage peut etre en creant
	public Mobil() {
		caract = new Caracteristic();
		life = new Life(caract);
		name = "people";
	}
	public Mobil(Caracteristic caract) {// pour ca il faut definir les caracteristique avant.
		this.caract = caract;
		life = new Life(caract);
		name = "people";
	}
	public void hit(Mobil mob) {
		// ici que il faut gerer les points le gain d'experience si le peresonnage meurt
	}
	
	protected double B(double p, double c) {
		return;
		// ca va servir pour frapper les enemies
		// mettre le fait que si la vie est à zero
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
