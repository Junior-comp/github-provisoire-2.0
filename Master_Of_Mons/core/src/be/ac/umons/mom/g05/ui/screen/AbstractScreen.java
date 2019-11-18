package be.ac.umons.mom.g05.ui.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.utils.viewport.FitViewport;

import be.ac.umons.mom.g05.MasterOfMons;

public abstract class AbstractScreen implements Screen {
	
    protected final MasterOfMons game;
    protected final FitViewport viewport;
    
    public AbstractScreen(final MasterOfMons game) {
    	this.game=game;
    	viewport=game.getScreenViewport();
    }
    
    @Override
    public void resize(final int width, final int height) {
    	viewport.update(width,height);
    }
}
