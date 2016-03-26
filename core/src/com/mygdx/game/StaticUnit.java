package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class StaticUnit extends Unit {
	protected Texture myTexture;
	protected Sprite mySprite;
	public StaticUnit(String texture, float xpos, float ypos) {
		super(xpos,ypos); 
		myTexture= new Texture(Gdx.files.internal(texture));
		mySprite= new Sprite(myTexture);
		x=xpos;
		y=ypos;
		
	}
}
