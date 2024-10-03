package test;
import java.util.List;

import java.util.Scanner;

public class Susi {
	private List<Course> courses;
	private Student currStudent;
	
	public Susi(List<Course> courses, Student curr) {
		this.courses = courses;
		currStudent = curr;
		
	}
	
	
	
	public void enrollMe() {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		currStudent.enrolCourse(courses.get(n));
		
		in.close();
	}
	
	public void removeMe() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		currStudent.leaveCourse(courses.get(n));
		in.close();
	}
	
	public void myCourses() {
		for(int i = 0; i < currStudent.getCourses().size();i++) {
			currStudent.getCourseAt(i).print();
		}
	}
	
	public void getMyData() {
		
		currStudent.print();
	}
	
	public void getCourseInfo() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		courses.get(n).print();
		in.close();
		
	}


	public void setCurrStudent(Student currStudent) {
		this.currStudent = currStudent;
	}
	
	
}
