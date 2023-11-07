package com.practice.designpattern.commande;

public class CommandeManager {

	private static  CommandeManager instance;
	
	private CommandeManager() {
		
	}
	
	public static  CommandeManager getinstance() {
		if (instance == null) {
			instance = new CommandeManager();
		}
		return instance;
	}
}
