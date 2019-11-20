package be.ac.umons.mom.g05.instance.mob.carasteristic;

public class Mood {
	MoodType moodtype;
	public Mood() {
		moodtype = MoodType.NEUTRAL;
	}
	
	public Mood(MoodType moodtype) {
		this.moodtype = moodtype;
	}
	
	public void changeMood(MoodType moodtype) {
		if(moodtype==MoodType.NEUTRAL)
			this.moodtype = MoodType.NEUTRAL;
		
		else if(moodtype==MoodType.AGGRESSIVE)
			this.moodtype = MoodType.AGGRESSIVE;
		
		else if(moodtype==MoodType.DEFENSIVE)
			this.moodtype = MoodType.DEFENSIVE;
		
		else if(moodtype==MoodType.FRIENDLY)
			this.moodtype = MoodType.FRIENDLY;
	}
}
