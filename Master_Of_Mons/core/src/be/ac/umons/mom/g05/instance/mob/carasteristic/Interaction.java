package be.ac.umons.mom.g05.mob.carasteristic;

import be.ac.umons.mom.g05.mob.*;

public interface Interaction {
	String speak(Mobile mob);
	String speak(Mobile mob, String swords);
	void listen(Mobile mob);
}
