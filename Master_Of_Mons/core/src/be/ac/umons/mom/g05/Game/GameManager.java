package be.ac.umons.mom.g05.Game;

import be.ac.umons.mom.g05.instance.mob.*;

// ceci est la classe qui va s'occupper de la partie de jeu c'est a dire que c'est la que il y'aura normalement les differents niveaux les differentes quetes cad 7 qutes c'est ici que on va gerer le fait que les quetes sont fini ou pas

public class GameManager {
	
    //un tableau de quetes par niveau(puisque il faut separer les quetes pour chaque niveau)
    // on va gerer l'initialisation du personnage
	// il faut check si il faut 
	// ici on va mettre des levelchecker cad des truc qui vont representer des niveau a passer
	
	private Levelchecker[] levels;       // tout les niveaux qui sont censé etre dans le jeu cad de ba1 jusqu'a ma2
	private Levelchecker currentlevel;   // le niveau courant quand un niveau est fini on change de  niveau et c'est le niveau suivant qui devient le niveau courant
	private PC player;
	public GameManager() {               // le truc de base
		levels = new Levelchecker[5];
		levels[0] = new Levelchecker(1);
		levels[1] = new Levelchecker(2);
		levels[2] = new Levelchecker(3);
		levels[3] = new Levelchecker(4);
		levels[4] = new Levelchecker(5);

		}
	public GameManager(Levelchecker[] levels) {
		this.levels = levels;
		
	}
}
