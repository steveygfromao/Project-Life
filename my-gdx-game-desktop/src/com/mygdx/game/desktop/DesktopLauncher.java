package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.mygdx.game.*;

// Main class - 26/3/2016
public class DesktopLauncher {
	public static void main (String[] arg) {
		
		// Resolutions
		// 1920x1080, 1280x800,1440x900, 1600x900,1680x1050,1360x780, 1024x768
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Project Life V1.0";
		config.width = 1280;//1600;//1280;//1600;//1600;
		config.height = 800;//900;//800;//900;//900;//900;
		config.vSyncEnabled = true;
		config.backgroundFPS =120;
		config.foregroundFPS = 120;
		config.fullscreen = !true;
		config.resizable = false;
	
		new LwjglApplication(new Sterria(), config);
	
	}
}
