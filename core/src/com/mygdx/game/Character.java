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
		velo_y=4;
	}
	public boolean isGrouded(){

		return false;
	}
	public TextureRegion render(float AnimTime){
		return myAnim.getKeyFrame(AnimTime,true);
	}
	public void move(){
		x+=velo_x;
		y+=velo_y;
	}
}
