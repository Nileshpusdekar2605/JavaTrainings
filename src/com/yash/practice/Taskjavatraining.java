package com.yash.practice;

import java.util.logging.Logger;

public class Taskjavatraining {
	static Logger logger = Logger.getLogger(Taskjavatraining.class.getName());
	String trainer;
	int employee;
	long empmob;
	double marker;
	String room;
	int projector;
	int mobile;
	
	
	public void addvalue(String trainer,int employee,long empmob,double marker,String room) {
		System.out.println("Trainer Name :"+trainer+"Employee Number :"+employee+"Employee Number :"+empmob+"Marker pen :"+marker+"Training Room :"+room);
	}
	
	public void addvalue(String trainer,int employee,long empmob,double marker,String room,int projector,int mobile) {
		System.out.println("Trainer Name :"+trainer+"Employee Number :"+employee+"Employee Number :"+empmob+"Marker pen :"+marker+"Training Room :"+room);
	}
	public static void main(String[] args) {
		Taskjavatraining tj=new Taskjavatraining();
		tj.addvalue(" Snehal Pawar ", 40 , 987675656 , 10 , "Agile Room" );
		Taskjavatraining tj1=new Taskjavatraining();
		tj1.addvalue(" Snehal Pawar ", 40 , 987675656 , 10 , "Agile Room",2,14 );
		/*System.out.println(tj.hashCode());
		System.out.println(tj1.hashCode());
		System.out.println(tj==tj1);
		System.out.println(tj.equals(tj1));
		System.out.println(tj);*/
		
	}
}
