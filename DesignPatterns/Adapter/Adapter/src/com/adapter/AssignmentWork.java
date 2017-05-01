package com.adapter;

public class AssignmentWork {
	
	private Pen p; 

	public void writeAssignment(String str){
		p.write(str);
	}
	
	public Pen getPen(){
		return p;
	}
	
	public void setPen(Pen p){
		this.p=p; 
	}
	
	
	
	
	
}
