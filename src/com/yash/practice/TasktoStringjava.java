package com.yash.practice;


public class TasktoStringjava {
	
	String trainer;
	int employee;
	long empmob;
	double marker;
	String room;
	
	public TasktoStringjava(String trainer,int employee,long empmob,double marker,String room) {
	this.trainer=trainer;
	this.employee=employee;
	this.empmob=empmob;
	this.marker=marker;
	this.room=room;
	}
	@Override
	public String toString() {
		return "TasktoStringjava [trainer=" + trainer + ", employee=" + employee + ", empmob=" + empmob + ", marker="
				+ marker + ", room=" + room + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public static void main(String[] args) {
		TasktoStringjava tj=new TasktoStringjava("Nilesh", 40, 898980, 110, "Training room");
		//System.out.println(tj);
		
	}

}
