package com.adapter;

public class School {
	
	public static void main (String[] Args){
		
		//PilotPen pp  = new PilotPen(); //==>we have a pilot pen obj
		// BUT we need a pen object to pass into setPen
		
		Pen p = new PenAdapter(); 
		
		AssignmentWork aw = new AssignmentWork(); 
		//aw.setPen(??); // ISSUE==> we need an object of Pen interface
		aw.setPen(p);
		aw.writeAssignment("tired af");
		
	}

}
