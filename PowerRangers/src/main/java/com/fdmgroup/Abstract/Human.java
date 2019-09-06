package com.fdmgroup.Abstract;

public class Human extends Morpher{

	public IPowerRanger Morph(String identifier) {
		if(identifier=="blue") {
			return new BlueRanger();
		}
		if(identifier=="pink") {
			return new PinkRanger();
		}
		if(identifier=="green") {
			return new GreenRanger();
		}
		System.out.println("*Inaudible static noises*");
		return null;
	}
		
}
