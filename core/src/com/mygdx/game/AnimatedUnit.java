package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Rectangle;

public class AnimatedUnit extends Unit {
	protected Animation myAnim;
	protected int animState; // 0:static 1:rest 2:in movement
	protected TextureAtlas myTextureAtlas;
	public Hitbox hitbox;
	public AnimatedUnit(String textureAtlas, float xpos, float ypos) {
		super(xpos,ypos); 
		myTextureAtlas= new TextureAtlas(Gdx.files.internal(textureAtlas));
		myAnim= new Animation(1/16f, myTextureAtlas.getRegions());
		x=xpos;
		y=ypos;

	}


}
