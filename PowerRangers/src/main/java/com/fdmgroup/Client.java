package com.fdmgroup;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PowerRangerFactory powerRangerFactory = new PowerRangerFactory();
		
		
		IPowerRanger iPowerRanger = powerRangerFactory.getPowerRanger("red");
		
		iPowerRanger.ItsMorphingTime();
			
		IPowerRanger iPowerRanger1 = powerRangerFactory.getPowerRanger("blue");
		
		iPowerRanger1.ItsMorphingTime();
		
		IPowerRanger iPowerRanger2 = powerRangerFactory.getPowerRanger("green");
		
		iPowerRanger2.ItsMorphingTime();
	}

}



