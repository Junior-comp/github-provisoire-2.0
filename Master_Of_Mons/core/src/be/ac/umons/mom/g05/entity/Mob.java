package be.ac.umons.mom.g05.entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.*;

import be.ac.umons.mom.g05.mob.Mobile;

public class Mob extends Actor {
	private Animation animation;// pour gerer les animations et on va voir comment ca va faire
	private Mobile mobile;
	private TextureRegion texture = new TextureRegion();
	private Texture img;
	private float x;
	private float y;
	
	public Mob(Mobile mobil, Texture img) {// normalement une initialisationn du personnage
		texture.setRegion(img);
		this.setSize( img.getWidth(), img.getHeight());
	}
	
	
	

}
