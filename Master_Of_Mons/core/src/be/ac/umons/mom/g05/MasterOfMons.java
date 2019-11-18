package be.ac.umons.mom.g05;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import be.ac.umons.mom.g05.ui.screen.*;

public class MasterOfMons extends Game {
	
	public MasterOfMons() {
		super();
	}
	
	@Override
	public void create () {
		setScreen(new LoadingScreen());
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
	}
	
	public void changeScreen() { //change the screen
		
	}
}
