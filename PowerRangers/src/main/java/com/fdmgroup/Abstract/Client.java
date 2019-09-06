package com.fdmgroup.Abstract;

public class Client {

	public static void main(String[] args) {
		
		//get the roster that holds all 3 Power Rangers
		RangerRoster rangerRoster = new RangerRoster();
		Morpher morpher = new Morpher();
		// 
		//Remember its getRanger(Boolean Human)

		RangerRoster.getRanger(false);
		
	
		//now morph the NON-human form ranger
		
		
		//ITS MIGHTY FREAKING MORPHING TIME!!!!
		IPowerRanger ranger1 = Morpher.Morph("blue");
		IPowerRanger.MightyMorphingTime();
		IPowerRanger ranger2 = Morpher.Morph("green");
		IPowerRanger.MightyMorphingTime();
		IPowerRanger ranger3 = Morpher.Morph("pink");
		IPowerRanger.MightyMorphingTime();
		
		//Now Lets get some Humans instead!
		
		RangerRoster.getRanger(true);
		
		//ITS MIGHTY HECKING UN-MORPHING TIME!!!!!
		
		IPowerRanger ranger4 = Morpher.Morph("Justin");
		IPowerRanger.MightyMorphingTime();
		IPowerRanger ranger5 = Morpher.Morph("Adam");
		IPowerRanger.MightyMorphingTime();
		IPowerRanger ranger6 = Morpher.Morph("katherine");
		IPowerRanger.MightyMorphingTime();
		
		
		
		
		

	}

}
