package be.ac.umons.mom.g05.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import be.ac.umons.mom.g05.MasterOfMons;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Master of Mons";
		config.width=750;
		config.height=750;
		new LwjglApplication(new MasterOfMons(), config);
	}
}
