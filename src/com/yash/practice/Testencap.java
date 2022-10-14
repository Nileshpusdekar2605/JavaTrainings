package com.yash.practice;

public class Testencap {
	
	public static void main(String[] args) {
		Javatraining j=new Javatraining();
		j.setTrainer("Snehal Pawar");
		j.setWhitebord("Whitwboard");
		j.setMarker(5);
		j.setChair("100");
		j.setLaptop(40);
		
		System.out.println(j.getTrainer());
		System.out.println(j.getWhitebord());
		System.out.println(j.getMarker());
		System.out.println(j.getChair());
		System.out.println(j.getLaptop());
		
		System.out.println(j.getTrainer()+" "+j.getWhitebord()+" "+j.getMarker()+" "+j.getChair()+" "+j.getLaptop());
	}

}
