package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
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
	    private TiledMap tiledMap;
	    private OrthographicCamera camera;
	    private TiledMapRenderer tiledMapRenderer;
	    private SpriteBatch sb;
	    private Texture texture;
	    private Map mapStage1;
	    private Character djeoh;
	    private Unit[] units = new Unit[10];
	    public static TextureAtlas djeohAtlas;
	    private Animation animation;
	    private float x,y;
	    private float elapsedTime = 0;

	    @Override public void create () {
	        float w = Gdx.graphics.getWidth();
	        float h = Gdx.graphics.getHeight();
	        djeoh = new Character("/Users/Nino/Documents/Cours/Projet Info/InitiationPRO/core/assets/data/texture.atlas.txt",0,0);
	        units[0]= djeoh;
	        mapStage1= new Map("/Users/Nino/Documents/Cours/Projet Info/InitiationPRO/core/assets/niveau1.tmx");
	        tiledMapRenderer = new OrthogonalTiledMapRenderer(mapStage1.tiledMap);
	        sb= new SpriteBatch();
	        camera = new OrthographicCamera();
	        camera.setToOrtho(false,w,h);

	        //sprite = new Sprite(texture);
	    }
	    @Override
	    public void dispose() {
	        sb.dispose();

	    }
	    
	    @Override
	    public void render () {
	    	elapsedTime +=Gdx.graphics.getDeltaTime();
	        Gdx.gl.glClearColor(0, 0, 0, 0);
	        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
	        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	        
	        
	        
	        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
	        	   x-=2;
	        	   camera.translate(-20,0);
	        }
		           

		    if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
		    		camera.translate(20,0);
		        	x+=2;
		    }
		    				    				    
	        camera.update();
	        tiledMapRenderer.setView(camera);
	        tiledMapRenderer.render();
	        sb.begin();
	        sb.draw(djeoh.render(elapsedTime),x,y);
	        sb.end();
	    }

	
	   
}