package be.ac.umons.mom.g05.ui.screen;
/*
 * le lien de l'image utilis� est : https://www.google.com/
 */
import com.badlogic.gdx.*;
import com.badlogic.gdx.files.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import be.ac.umons.mom.g05.MasterOfMons;

public class MenuScreen implements Screen {
	private Stage stage;
	private Texture image;
	private ImageButton newgame;
	private ImageButton load;
	private ImageButton Extension;
	MasterOfMons game;
	private int width=864;
	private int length=1536;

	
	public MenuScreen(MasterOfMons game) {
		this.game = game;
		FileHandle background = Gdx.files.internal("c621b6112664b74b416c834336f86429_original.png");
		image = new Texture(background);
		Image img = new Image(image);
		stage = new Stage(new ScreenViewport());
		img.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		img.setPosition(0, 0);
		stage.addActor(img);
		
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
		stage.act();
		stage.draw();

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
