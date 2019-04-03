package model;

import java.util.Arrays;
import java.util.Comparator;

public class Course {
	private Student[] students;
	
	public Course(Student[] sts) {
		students = sts;
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	//Selection Sort
	public void sortByLastname() {
		for (int I = 0; I < students.length-1; I++) {
			String minLastName = students[I].getLastname();
			int minPosition = I;
			
			for (int J = I+1; J < students.length; J++) {
				String currentLastName = students[J].getLastname();
				if(currentLastName.compareTo(minLastName) < 0) {
					minLastName = currentLastName;
					minPosition = J;
				}
			}
			
			Student temp = students[minPosition];
			students[minPosition] = students[I];
			students[I] = temp;
		}
	}
	
	public void sortByCode() {
		Arrays.sort(students);
	}
	
	public void sortByName() {
		Comparator<Student> studentComparator = new StudentNameComparator();
		
		Arrays.sort(students,studentComparator);
	}
	
	public void sortByFullName() {
		Arrays.sort(students,new StudentFullNameComparator());
	}
}
