package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MonPremierJeux;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "hello-world";
        config.useGL30 = false;
        config.width = 1920;
        config.height = 800;
        config.foregroundFPS = 30;
		new LwjglApplication(new MonPremierJeux(), config);
		
	}
}
