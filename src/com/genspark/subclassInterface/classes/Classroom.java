package com.genspark.subclassInterface.classes;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Classroom extends Room {

	//Members
	private int numStudents;
	
	//Constructor
	public Classroom(double width, double length, int floor, int numStudents) {
		super(width, length, floor);
		setNumStudents(numStudents);
	}
	
	//Methods
	public int getNumStudents() {
		return numStudents;
	}
	
	public void setNumStudents(int numStudents) {
		if (numStudents < 0) return;
		this.numStudents = numStudents;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", capacity = " + String.valueOf(this.numStudents) + " students";
	}
	
	public static Classroom[] getClassRooms(Room[] rooms) {
		Map<String, List<Room>> roomDistinct = Stream.of(rooms).collect(Collectors.groupingBy(Room::toString));
//		Map<String, Long> roomDistincts = Stream.of(rooms).collect(Collectors.groupingBy(room-> Room::toString, Collectors.counting()));
//		Map<Room, Long> roomDistinct = Stream.of(rooms).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Classroom[] result = roomDistinct.entrySet().stream().map(e -> 
		new Classroom(
				e.getValue().get(0).getWidth(),
				e.getValue().get(0).getLength(),
				e.getValue().get(0).getFloor(),
				e.getValue().size())).toArray(Classroom[]::new);
		return result;
	}
}
