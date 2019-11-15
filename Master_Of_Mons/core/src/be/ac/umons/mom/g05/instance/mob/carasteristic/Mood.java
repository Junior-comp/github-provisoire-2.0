package be.ac.umons.mom.g05.instance.mob.caracteristic;

import be.ac.umons.mom.g05.instance.mob.caracteristic.Mood.Moods;

public class Mood {
	private enum Moods {HUNGRY, NICE, DEFENSIVE,SAD}
	Moods mood;
	public Mood() {
		mood = Moods.NICE;
	}
	
	public Mood(Moods mood) {
		this.mood = mood;
	}
	
	public void changemood(int i) {
		if(i == 1)
			mood = Moods.HUNGRY;
		else if(i == 2)
			mood = Moods.NICE;
		else if(i == 3)
			mood = Moods.DEFENSIVE;
		else if(i == 4)
			mood = Moods.SAD;
	}
}
