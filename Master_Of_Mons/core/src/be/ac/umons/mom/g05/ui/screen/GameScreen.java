package be.ac.umons.mom.g05.ui.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

import be.ac.umons.mom.g05.MasterOfMons;

public class GameScreen extends AbstractScreen {
	
	private final OrthogonalTiledMapRenderer maprenderer;
	private final AssetManager assetmanager;
	private final OrthographicCamera gamecamera;
	private static final float UNIT_SCALE = 1 / 16f;	

	
	public GameScreen(final MasterOfMons game) {
		super(game);
		maprenderer=new OrthogonalTiledMapRenderer(null, UNIT_SCALE, game.getSpriteBatch());
		this.gamecamera=game.getGameCamera();
		this.assetmanager=game.getAssetManager();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		maprenderer.setMap(assetmanager.get("clearTiled.tmx",TiledMap.class));
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		if(Gdx.input.isKeyPressed(Input.Keys.Z)) {   // Push "Z" to switch the screen to LoadingScreen type
			game.setScreen(ScreenType.MENU);
		}
		viewport.apply(true);

		maprenderer.setView(gamecamera);
		maprenderer.render();
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
