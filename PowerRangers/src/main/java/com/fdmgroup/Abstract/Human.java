package com.fdmgroup.Abstract;

public class Human extends Morpher{

	@Override
	IPowerRanger Morph(String color) {
		if(color=="black") {
			return new BlackRanger();
		}
		if(color=="pink") {
			return new PinkRanger();
		}
		if(color=="white") {
			return new WhiteRanger();
		}
		System.out.println("*Inaudible static noises*");
		return null;
	}
		
}
