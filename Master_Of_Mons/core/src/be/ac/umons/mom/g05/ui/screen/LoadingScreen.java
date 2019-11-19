package be.ac.umons.mom.g05.ui.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import be.ac.umons.mom.g05.MasterOfMons;

public class LoadingScreen extends AbstractScreen {
	
	private AssetManager assetmanager;
	
	public LoadingScreen(final MasterOfMons game) {
		super(game);
		this.assetmanager=game.getAssetManager();
		assetmanager.load("clearTiled.tmx",TiledMap.class);
		FileHandle background = Gdx.files.internal("loadingscreen.png");
		image = new Texture(background);
		Image img = new Image(image);
		img.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		stage = new Stage(new ScreenViewport());
		img.setPosition(0, 0);
		stage.addActor(img);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		assetmanager.getProgress();
		if(assetmanager.update()) {   
			game.setScreen(ScreenType.GAME);
		}
		
		assetmanager.update();
		
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
