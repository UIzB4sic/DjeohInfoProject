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
    		character.jump();

    }
	}
}
