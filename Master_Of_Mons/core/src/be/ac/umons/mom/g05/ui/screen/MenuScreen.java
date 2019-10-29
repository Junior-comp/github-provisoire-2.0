package be.ac.umons.mom.g05.ui.screen;
/*
 * le lien de l'image utilisé est : https://www.google.com/
 */
import com.badlogic.gdx.*;
import com.badlogic.gdx.files.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;

import be.ac.umons.mom.g05.MasterOfMons;

public class MenuScreen implements Screen {
	private Stage stage;
	private Texture image;
	private ImageButton newgame;
	private ImageButton load;
	private ImageButton Extension;
	SpriteBatch batch;
	MasterOfMons game;
	
	public MenuScreen(MasterOfMons game) {
		this.game = game;
		FileHandle background = Gdx.files.internal("c621b6112664b74b416c834336f86429_original.png");
		image = new Texture(background);
		batch = new SpriteBatch();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw( image, 0, 0);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
