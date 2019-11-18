package be.ac.umons.mom.g05;

import java.util.EnumMap;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.reflect.ClassReflection;
import com.badlogic.gdx.utils.reflect.ReflectionException;
import com.badlogic.gdx.utils.viewport.FitViewport;

import be.ac.umons.mom.g05.ui.screen.*;

public class MasterOfMons extends Game {
	
	private static final String TAG = MasterOfMons.class.getSimpleName();
	
	private EnumMap<ScreenType, AbstractScreen> screenCache;
	private FitViewport screenViewport;
	
	private final int WORLDWIDTH = 17;
	private final int WORLDHEIGHT = 31;

	
	public MasterOfMons() {
		super();
	}
	
	@Override
	public void create () {
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		
		screenViewport = new FitViewport(WORLDWIDTH,WORLDHEIGHT);
		screenCache = new EnumMap<ScreenType,AbstractScreen>(ScreenType.class);
		setScreen(ScreenType.LOADING);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
	}
	
	/**
	 * @author goffinet nicolas
	 * @param screenType
	 * this method create or switch a screen
	 */
	public void setScreen(final ScreenType screenType) { 
		final Screen screen = screenCache.get(screenType); 
		if(screen==null) {
			// screen is not created yet -> We need to create it
			try {
				Gdx.app.debug(TAG, "Creating a new screen: " + screenType);
				final AbstractScreen newScreen = (AbstractScreen) ClassReflection.getConstructor(screenType.getScreenClass(),MasterOfMons.class).newInstance(this);
				screenCache.put(screenType, newScreen);
				setScreen(newScreen);
			} catch(ReflectionException e) {
				throw new GdxRuntimeException("Screen "+screenType+" could not be created ",e);
				
			}
		} else { 
			// screen is already created
			Gdx.app.debug(TAG,"Switching to screen " + screenType);
			setScreen(screen);
		}
	}

	public FitViewport getScreenViewport() {
		// TODO Auto-generated method stub
		return screenViewport;
	}
}
