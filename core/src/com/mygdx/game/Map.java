package com.mygdx.game;

import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.TiledMap;

public class Map {
	 TiledMapRenderer mapRenderEngine;
     TiledMap tiledMap;
   public Map(String tileMapFile){
    	tiledMap = new TmxMapLoader().load(tileMapFile);
    }



}
