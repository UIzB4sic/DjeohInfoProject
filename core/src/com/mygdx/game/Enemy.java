package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public class Enemy extends AnimatedUnit {
	float velo_x, velo_y;
	boolean isGrounded = true;
	public Hitbox hitbox;
	
	public Enemy(String textureAtlas, float xpos, float ypos) {
		super(textureAtlas,xpos,ypos); 		
	}
	public TextureRegion render(float AnimTime){
		return myAnim.getKeyFrame(AnimTime,true);
	}
	/**
	public void interact(Unit unit)
	{
		if(unit.hitbox.intersects(this.hitbox)){
			System.out.println("ennemi détecté");
		}
	}
	
			
	public void moveHitbox(){
		hitbox.move(velo_x, velo_y);
	}
	**/
}
