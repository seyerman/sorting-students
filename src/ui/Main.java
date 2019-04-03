package ui;

import model.Course;
import model.Student;

public class Main {

	public static void main(String[] args) {
		Course course = new Course(
				new Student[] {
						new Student("Juan","Reyes","A0123",1.3),
						new Student("Marisol","Giraldo","A9876",4.9),
						new Student("Daniel","Fernández","A4567",2.4),
						new Student("Emilio","Rodríguez","A3456",2.9),
						new Student("Oscar","Riascos","A6543",3.1),
						new Student("Pedro","Riascos","A6543",3.1),
						new Student("Pablo","Riascos","A6543",3.1)						
				}
		);
		
		
		Student[] sts1 = course.getStudents();
		System.out.println("=======\nAt the begin");
		printStudents(sts1);
		
		course.sortByLastname();
		System.out.println("=======\nSorted by Lastname");
		Student[] sts2 = course.getStudents();
		printStudents(sts2);
		
		course.sortByCode();
		System.out.println("=======\nSorted by Code");
		Student[] sts3 = course.getStudents();
		printStudents(sts3);
		
		course.sortByName();
		System.out.println("=======\nSorted by Name");
		Student[] sts4 = course.getStudents();
		printStudents(sts4);
		
		course.sortByFullName();
		System.out.println("=======\nSorted by Full Name");
		Student[] sts5 = course.getStudents();
		printStudents(sts5);
	}
	
	
	public static void printStudents(Student[] array) {
		for (int I = 0; I < array.length; I++) {
			System.out.println(array[I].getName()+"\t"
					+array[I].getLastname()+"\t"
					+array[I].getCode()+"\t"
					+array[I].getGrade()+"\t"
					);
		}
	}

}
