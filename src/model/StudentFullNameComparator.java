package model;

import java.util.Comparator;

public class StudentFullNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student st1, Student st2) {
		int comparator;
		String name1 = st1.getName();
		String name2 = st2.getName();
		String lname1 = st1.getLastname();
		String lname2 = st2.getLastname();
		
		if(lname1.compareTo(lname2)<0) {
			comparator = -1;
		}else if(lname1.compareTo(lname2)>0) {
			comparator = 1;
		}else {
			if(name1.compareTo(name2)<0) {
				comparator = -1;
			}else if(name1.compareTo(name2)>0) {
				comparator = 1;
			}else {
				comparator = 0;
			}
		}
		return comparator;
	}

}
