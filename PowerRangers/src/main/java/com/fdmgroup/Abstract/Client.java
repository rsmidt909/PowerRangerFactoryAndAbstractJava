package com.fdmgroup.Abstract;

public class Client {

	public static void main(String[] args) {
		
		//get the roster that holds all 3 Power Rangers
		RangerRoster rangerRoster = new RangerRoster();
		// 
		//Remember its getRanger(Boolean Human)

		rangerRoster.getRanger(false);
		
	
		//now morph the NON-human form ranger
		
		
		//ITS MIGHTY FREAKING MORPHING TIME!!!!
		IPowerRanger ranger1 = Morpher.Morph("blue");
		ranger1.MightyMorphingTime();
		IPowerRanger ranger2 = Morpher.Morph("green");
		ranger2.MightyMorphingTime();
		IPowerRanger ranger3 = Morpher.Morph("pink");
		ranger3.MightyMorphingTime();
		
		//Now Lets get some Humans instead!
		
		rangerRoster.getRanger(true);
		
		//ITS MIGHTY HECKING UN-MORPHING TIME!!!!!
		
		IPowerRanger ranger4 = Morpher.Morph("Justin");
		ranger4.MightyMorphingTime();
		IPowerRanger ranger5 = Morpher.Morph("Adam");
		ranger5.MightyMorphingTime();
		IPowerRanger ranger6 = Morpher.Morph("katherine");
		ranger6.MightyMorphingTime();
		
		
		
		
		

	}

}
