package com.fdmgroup.Abstract;

public class RangerRoster {
	
	
	
	
	
	
	public static Morpher getRanger(boolean Human) {
		if(Human) {
			return new Human();
		}else {
			return new PowerRanger();
		}
	}
	
	

	

}
