package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import java.io.File;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector3;

public class Stage1 extends ApplicationAdapter  {
	    private OrthographicCamera camera;
	    private TiledMapRenderer tiledMapRenderer;
	    private SpriteBatch sb;
	    private GameController game;
	    private Map mapStage1;
	    private Character djeoh;
	    private Hitbox hitboxDjeoh;
	    private Enemy enemy;
	    private Hitbox hitboxEnemy;
	    private Unit[] units = new Unit[10];
	    public static TextureAtlas djeohAtlas;

	    @Override public void create () {
	        float w = Gdx.graphics.getWidth();
	        float h = Gdx.graphics.getHeight();
	        djeoh = new Character("data/texture.atlas.txt",0,0);
	        units[0]= djeoh;
	        djeoh.move(0, 315);
	        
	        /**
	        enemy = new Enemy("data/enemy.atlas.txt",0,0);
	        units[1]=enemy;
	        enemy.move(315, 315);
	        **/
	        
	        


	        mapStage1= new Map("niveau1.tmx");
	        tiledMapRenderer = new OrthogonalTiledMapRenderer(mapStage1.tiledMap);
	        sb= new SpriteBatch();
	        camera = new OrthographicCamera();
	        camera.setToOrtho(false,w,h);
	        game = new GameController(mapStage1,camera,djeoh);

	    }
	    @Override
	    public void dispose() {
	        sb.dispose();

	    }
	    
	    @Override
	    public void render () {
	        Gdx.gl.glClearColor(0, 0, 0, 0);
	        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
	        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	        
	        
	       	game.manageControlls();
	       	game.update();
	        camera.update();
	        tiledMapRenderer.setView(camera);
	        tiledMapRenderer.render();
	        sb.begin();
	        sb.draw(djeoh.render(game.animTime),djeoh.x,djeoh.y);
	        sb.end();
	    }

	
	   
}