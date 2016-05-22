package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Unit {

	 float x,y, height, width;
	//public Hitbox hitbox;
	
	public Unit(float xpos, float ypos) {
		//myTexture= new Texture(Gdx.files.internal(textureFile));
		//mySprite= new Sprite(myTexture);
		x=xpos;
		y=ypos;
		
	}
	public Unit() {
		//myTexture= new Texture(Gdx.files.internal(textureFile)
		
	}
	public void move(float deltax, float deltay)
	{
		x+=deltax;
		y+=deltay;		
	}
	public boolean isVisible(){
		return false;
	}
	
	public void spawn(float x, float y){
		
	}
	public void withdraw(){
		
	}

}
