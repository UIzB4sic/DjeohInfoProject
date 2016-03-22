package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import  com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector3;

public class MonPremierJeux extends ApplicationAdapter implements InputProcessor {
	  private Texture img;
	    private TiledMap tiledMap;
	    private OrthographicCamera camera;
	    private TiledMapRenderer tiledMapRenderer;
	    private SpriteBatch sb;
	    private Sprite sprite1;
	    
	    private Texture texture;
	    public static TextureAtlas djeohAtlas;
	    private Animation animation;
	    private float x,y;
	    private Sprite sprite;
	    private float elapsedTime = 0;

	    @Override public void create () {
	        float w = Gdx.graphics.getWidth();
	        float h = Gdx.graphics.getHeight();
	        x=0;
	        y=320;
	        djeohAtlas = new TextureAtlas(Gdx.files.internal("/Users/Nino/Documents/Cours/Projet Info/InitiationPRO/core/assets/data/texture.atlas.txt"));
	        animation= new Animation(1/16f, djeohAtlas.getRegions());
	        texture= new Texture(Gdx.files.internal("/Users/Nino/Documents/Cours/Projet Info/InitiationPRO/core/assets/data/texture.png"));
	        tiledMap = new TmxMapLoader().load("/Users/Nino/Documents/Cours/Projet Info/InitiationPRO/core/assets/niveau1.tmx");
	        tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
	        Gdx.input.setInputProcessor(this);
	        sb= new SpriteBatch();
	        sprite1= new Sprite(texture);
	        camera = new OrthographicCamera();
	        camera.setToOrtho(false,w,h);

	        //sprite = new Sprite(texture);
	    }
	    @Override
	    public void dispose() {
	    	djeohAtlas.dispose();
	        texture.dispose();
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
	        sb.draw(animation.getKeyFrame(elapsedTime,true),x,y);
	        sb.end();
	    }

	    @Override public boolean keyDown(int keycode) {
	        return false;
	    }

	    @Override public boolean keyUp(int keycode) {
	        
	        if(keycode == Input.Keys.UP)
	            camera.translate(0,-80);
	        if(keycode == Input.Keys.DOWN)
	            camera.translate(0,80);
	        if(keycode == Input.Keys.NUM_1)
	            tiledMap.getLayers().get(0).setVisible(!tiledMap.getLayers().get(0).isVisible());
	        if(keycode == Input.Keys.NUM_2)
	            tiledMap.getLayers().get(1).setVisible(!tiledMap.getLayers().get(1).isVisible());
	        return false;
	    }

	    @Override public boolean keyTyped(char character) {

	        return false;
	    }

	    @Override public boolean touchDown(int screenX, int screenY, int pointer, int button) {
	        return false;
	    }

	    @Override public boolean touchUp(int screenX, int screenY, int pointer, int button) {
	        return false;
	    }

	    @Override public boolean touchDragged(int screenX, int screenY, int pointer) {
	        return false;
	    }

	    @Override public boolean mouseMoved(int screenX, int screenY) {
	        return false;
	    }

	    @Override public boolean scrolled(int amount) {
	        return false;
	    }
}