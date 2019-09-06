package com.fdmgroup.Abstract;

public class PowerRanger extends Morpher{

	
	
	@Override
	IPowerRanger Morph(String name) {
		
		
		if(name=="Adam") {
			return new Adam();
		}
		if(name=="Justin") {
			return new Justin();
		}
		if(name=="Katherine") {
			return new Katherine();
		}	
		return null;
		
		
	}
	
	
	
}
