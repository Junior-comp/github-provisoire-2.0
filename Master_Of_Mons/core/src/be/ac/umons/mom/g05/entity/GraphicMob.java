package be.ac.umons.mom.g05.entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.*;

import be.ac.umons.mom.g05.mob.Mobile;

public class GraphicMob extends Actor {
	private Animation animation; // sprite animation ?
	private Mobile mobile;
	private TextureRegion texture = new TextureRegion();
	private Texture img;
	private float x;
	private float y;
	
	public GraphicMob(Mobile mobil, Texture img) { // Represent mob in graphic state
		texture.setRegion(img);
		this.setSize( img.getWidth(), img.getHeight());
	}
	
	
	

}
