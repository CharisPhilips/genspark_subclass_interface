package com.genspark.subclassInterface.classes;

public class Room implements Comparable<Room> {
	//Members
	private double length;
	private double width;
	private int floor;

	//Constructor
	public Room() {
		super();
		this.width = 10;
		this.length = 12.5;
		this.floor = 1;
	}

	public Room(double width, double length, int floor) {
		super();
		setWidth(width);
		setLength(length);
		setFloor(floor);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length < 0) return;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		if (width < 0) return;
		this.width = width;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		if (floor <= 0) return;
		this.floor = floor;
	}

	@Override
	public int compareTo(Room o) {
		if (this.floor != o.floor) {
			if(floor > o.floor) {
				return 1;  
			} else {  
				return -1;  
			}
		}
		if (this.length != o.length) {
			if(length > o.length) {
				return 1;  
			} else {  
				return -1;  
			}
		}
		if(width > o.width) {
			return 1;  
		} else if (width < o.width){  
			return -1;  
		} else {
			return 0;
		}
	}
	
	
	@Override
	public String toString() {
		return String.valueOf(this.length) + " x " + String.valueOf(this.width) + ", " + String.valueOf(this.floor);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Room) {
			if (this.width == ((Room)obj).width &&
				this.length == ((Room)obj).length &&
				this.floor == ((Room)obj).floor
			) {
				return true;
			}
		} 
		return false;
	}
}