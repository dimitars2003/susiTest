package test;
import java.util.List;


public class Student  extends Person {
	private Semester sem;
	private List<Course> courses;

	
	public Student() {
		super();
		sem = Semester.First;
	}
	
	public Student(String name, int age, Semester sem) {
		super(name,age);
		this.sem = sem;
	}

	public Semester getSem() {
		return sem;
	}

	public void setSem(Semester sem) {
		this.sem = sem;
	}
	
	public void enrolCourse(Course toAdd) {
		if(!isEnrolled(toAdd)) {
			this.courses.add(toAdd);
		}
	}
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public Course getCourseAt(int index){
		return courses.get(index);
	}
	
	public void leaveCourse(Course toAdd) {
		if(!isEnrolled(toAdd)) {
			courses.remove(toAdd);
		}
		return;
	}
	
	public boolean isEnrolled(Course check) {
		for(int i = 0; i < courses.size();i++) {
			if(courses.get(i) == check) {
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		super.print();
		System.out.println(sem.name());
		for(int i = 0; i < courses.size();i++) {
			System.out.println();
		}
	}
	
	
}
