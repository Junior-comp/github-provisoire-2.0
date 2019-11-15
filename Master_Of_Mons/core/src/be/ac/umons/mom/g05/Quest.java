package be.ac.umons.mom.g05;

public class Quest {
	private int type;
	private boolean finished = false;
	private String[] objectif;
	private boolean[] objstate;
	public Quest(int i) {// on initialise les quetes en fonction de leur 
		type = i;
		if(i == 1) {
			objectif = new String[2];
			objectif[0] = "Take books";
			objectif[1] = "Take basic weapon";
			objstate = new boolean[2];
		}else if(i == 2) {
			objectif = new String[5];
			objectif[0] = "Find the student";
			objectif[1] = "Visit the Univrsity without being killed by other students";
			objectif[2] = "Talk to the student";
			objectif[3] = "Receive the bag";
			objectif[4] = "Collect  five think on the floor";
			objstate = new boolean[5];
		}else if(i == 3) {
			objectif = new String[1];
			objstate = new boolean[1];
			objectif[0] = "pass the exam";
		}else if(i == 4) {
			objectif = new String[4];
			objstate = new boolean[3];
			objectif[0] = " talk to the Pnj ";
			objectif[1] = "Bring him 3 pen";
			objectif[2] = "Bring him bottle opener ";
			objectif[3] = "Bring him bucket of vomit ";
		}else  if(i == 5) {
			objectif = new String[2];
			objstate = new boolean[2];
			objectif[0] = "Talk to the professor at Da Vinci";
			objectif[1] = "kill students that attack the professor";
		}else if(i == 6) {
			objectif = new String[1];
			objstate = new boolean[1];
			objectif[0] = "Find the students the lost student";
		}else if(i == 7) {
			objectif = new String[2];
			objstate = new boolean[2];
			objectif[0] = "GO see the MA1 student";
			objectif[1] = "take the cure from the MA1 student";
		}else if(i == 8) {
			objectif = new String[1];
			objstate = new boolean[1];
			objectif[0] = "Pass the second exam";
		}else if(i == 9) {
			objectif = new String[1];
			objstate = new boolean[1];
			objectif[0] = "Survive to the  general figth(bagarre general fait chier)";
		}else if(i == 10) {
			objectif = new String[1];
			objstate = new boolean[1];
			objectif[0] = "Win the figth against the Boss";
		}
	}
	public String getobjectif(int i) {// regarder comment on fait les try catch ap
		try {
			return objectif[i];
		}catch(Exception e) {
			System.err.println("MAn c'est pas bon enleve moi ca");
		}
		return objectif[i]; // regarder bien le truc ici hein
	}
	
	public void changestate(int i) {// trouver la bonne exception
		try {
			objstate[i] = true;
		}catch(Exception e) {
		System.err.println("MAN C'est pas le bon");	
		}
	}
	public boolean getstate(int i) {// changer les chose
		try {
			return objstate[i];
		}catch(Exception e) {
			System.err.println("MAAAAAAAAAN");
		}
		return objstate[i];
	}
}
