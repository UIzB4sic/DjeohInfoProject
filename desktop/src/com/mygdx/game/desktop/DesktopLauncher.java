package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Stage1;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "hello-world";
        config.useGL30 = false;
        config.width = 1920;
        config.height = 800;
        config.foregroundFPS = 60;
		new LwjglApplication(new Stage1(), config);
		
	}
}
