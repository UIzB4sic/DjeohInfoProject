package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public class Character extends AnimatedUnit {
	float velo_x, velo_y;
	boolean isGrounded = true;
	public Hitbox hitbox;
	
	public Character(String textureAtlas, float xpos, float ypos) {
		super(textureAtlas,xpos,ypos);
		this.hitbox=new Hitbox(xpos, ypos, 10,10);
	}
	public void interact(Unit unit)
	
	{
		if(this.hitbox.intersects(this.hitbox)){
			System.out.println("ennemi détecté");
		}
	}
	
			
			
	public void jump()
	{
		velo_y=30;
	}
	public boolean isGrounded(){

		return false;
	}
	
	public TextureRegion render(float AnimTime){
		return myAnim.getKeyFrame(AnimTime,true);
	}
	
	public void move(){
		x+=velo_x;
		y+=velo_y;
	}
	
	public void moveHitbox(){
		hitbox.move(velo_x, velo_y);
	}
	
}
