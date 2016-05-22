package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

public class Hitbox {

	float x,y, height, width;
	public Rectangle rectangle=new Rectangle(0,0,0,0);
	
	public Hitbox(float xpos, float ypos, int width, int height) {
		this.x=xpos;
		this.y=ypos;
		this.width=width;
		this.height=height;
		rectangle.x=xpos;
		rectangle.y=ypos;
		rectangle.width=width;
		rectangle.height=height;
	}
	
	
	public void move(float velo_x, float velo_y)
	{
		x+=velo_x;
		y+=velo_y;
		rectangle.x+=velo_x;
		rectangle.y+=velo_y;		
	}
	
	public boolean intersects(Hitbox h){
		if(this.rectangle.overlaps(h.rectangle)){
			return true;
		}
		else
			return false;
	}

}
