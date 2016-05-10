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
        camera.position.set(character.x+750, 400, 0);
		character.velo_x=0;character.velo_y=0;
		if (!character.isGrounded){
			character.velo_y=-2; //idéalement il faudrait intégrer une équation de mouvement pour avoir une réelle sensation de chute, mais bon, oh, débug.
		}
	
		if (character.y==315){
			character.isGrounded=true; //machin machin s'il est au niveau du sol, alors isgrounded est vrai
		}
	}
	
	public void manageControlls(){
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
     	   
     	   character.velo_x=-1;
     	  animTime+=Gdx.graphics.getDeltaTime();
     }
	           

	    if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
	    		
	      	   	character.velo_x=1;
	       	  animTime+=Gdx.graphics.getDeltaTime();

	    }
	    if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
	    	//il faudrait un timer empêchant de  sauter deux fois trop rapprochées OU PLUTÔT arriver à lui faire reconnaître qu'il est sur le sol et pas avec ma méthode bancale.
	    		character.jump();
	    		character.isGrounded=false;
	    	

    }
	}
}
