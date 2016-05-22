package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class GameController {
	private OrthographicCamera camera;
	private Map map;
	private Character character;
	float animTime;
	public GameController(Map map, OrthographicCamera camera, Character character){
		this.map=map;
		this.camera=camera;
		this.character=character;
		animTime=0;
	}

	public void update(){
		character.move();
		character.moveHitbox();
        camera.position.set(character.x+800, 400, 0);
		character.velo_x=0;character.velo_y=0;
		
		if (!character.isGrounded()) {
			character.velo_y=-3; //idéalement il faudrait intégrer une équation de mouvement pour avoir une réelle sensation de chute, mais bon, oh, débug.
		}
	
		if (character.y==315){
			character.velo_y=0; //machin machin s'il est au niveau du sol, alors isgrounded est vrai
		}
		
	}
	
	public void manageControlls(){
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
     	   
     	   character.velo_x=-1;
     	  animTime+=Gdx.graphics.getDeltaTime();
     }
	           

	    if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
	    		
	      	   	character.velo_x=4; // Ce sera le truc à changer pour augmenter la difficulté des niveaux suivants, en parallèle avec la vitesse avec laquelle il saute.
	       	  animTime+=Gdx.graphics.getDeltaTime();

	    }
	    if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
	    		if(character.isGrounded() || character.y<=415){
	    			character.jump();
	    		}

    }
	}
}
