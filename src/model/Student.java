package model;

public class Student implements Comparable<Student>{
	private String name;
	private String lastname;
	private String code;
	private double grade;
	
	public Student(String n, String ln, String c, double g) {
		name = n;
		lastname = ln;
		code = c;
		grade = g;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public String getCode() {
		return code;
	}

	public double getGrade() {
		return grade;
	}

	@Override
	public int compareTo(Student otherStudent) {
		int comparation;
		if(code.compareTo(otherStudent.code)<0) {
			comparation = -1;
		}else if(code.compareTo(otherStudent.code)>0) {
			comparation = 1;
		}else {
			comparation = 0;
		}
		return comparation;
	}
	
	
}
