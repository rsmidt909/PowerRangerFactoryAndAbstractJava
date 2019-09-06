package com.fdmgroup;

public class PowerRangerFactory {

	
	
	public IPowerRanger getPowerRanger(String color) {
		if(color == "red") {
			return new RedRanger();
		}
		if(color == "blue") {
			return new BlueRanger();
		}
		if(color == "green") {
			return new GreenRanger();
		}
		return null;
	}
	
	
	
	
	
	
	
	
}
