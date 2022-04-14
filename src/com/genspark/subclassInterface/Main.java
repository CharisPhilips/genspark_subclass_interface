package com.genspark.subclassInterface;

import java.util.Arrays;
import java.util.stream.Stream;

import com.genspark.subclassInterface.classes.Classroom;
import com.genspark.subclassInterface.classes.Room;

public class Main {

	public static void main(String[] args) {
		Room room = new Room();
		System.out.println(room);
		
		Room[] sortRooms = {
			new Room(),
			new Room(11, 10, 1),
			new Room(11, 20, 1),	
			new Room(11, 30, 1),	
			new Room(11, 10, 3),	
			new Room(22, 10, 3),	
			new Room(11, 10, 2),	
			new Room(22, 10, 2),	
			new Room(11, 10, 2)	
		};
		Arrays.sort(sortRooms);
		System.out.println("Sort Room Test");
		Stream.of(sortRooms).forEach(e->System.out.println(e));
		
		Room[] classrooms = {
				new Room(),
				new Room(11, 10, 1),
				new Room(11, 10, 1),	
				new Room(11, 20, 1),	
				new Room(11, 20, 1),	
				new Room(22, 10, 2),	
				new Room(22, 10, 2),	
				new Room(22, 10, 2),	
				new Room(33, 10, 3)	
		};
		
		Classroom[] classes = Classroom.getClassRooms(classrooms);
		System.out.println("Class Room Test");
		Stream.of(classes).forEach(e->System.out.println(e));
	}

}
