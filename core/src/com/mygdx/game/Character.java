package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Character extends AnimatedUnit {
	float velo_x, velo_y;
	public Character(String textureAtlas, float xpos, float ypos) {
		super(textureAtlas,xpos,ypos); 		
	}
	public void interact(Unit unit)
	{
		
	}
	public void jump()
	{
		
	}
	public boolean isGrouded(){

		return false;
	}
	public TextureRegion render(float time){
		return myAnim.getKeyFrame(time,true);
	}
	
}
