package com.fdmgroup.Abstract;

public class PowerRanger extends Morpher{

	
	
	@Override
	public	IPowerRanger Morph(String identifier) {
		
		
		if(indentifier=="Adam") {
			return new Adam();
		}
		if(indentifier=="Justin") {
			return new Justin();
		}
		if(indentifier=="Katherine") {
			return new Katherine();
		}	
		return null;
		
		
	}
	
	
	
}
