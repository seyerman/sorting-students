package model;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		int comparation;
		String name1 = student1.getName();
		String name2 = student2.getName();
		
		if(name1.compareTo(name2)<0) {
			comparation = -1;
		}else if(name1.compareTo(name2)>0) {
			comparation = 1;
		}else {
			comparation = 0;
		}
			
		return comparation;
	}

}
