package be.ac.umons.mom.g05.mob.carasteristic;

public class Mood {
	Moods mood;
	public Mood() {
		mood = Moods.NICE;
	}
	
	public Mood(Moods mood) {
		this.mood = mood;
	}
	
	public void changemood(Moods mood) {
		this.mood = mood;
	}
}
