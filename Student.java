package test;
import java.util.List;


public class Student {
	private Semester sem;
	private List<Course> courses;
        private Person p;
	
	public Student() {
		p = new Person();
		sem = Semester.First;
		courses = new ArrayList<Course>();
	}
	
	public Student(String name, int age, Semester sem) {
		p= new Person(name,age);
		this.sem = sem;
		courses = new ArrayList<Course>();
	}

	public Semester getSem() {
		return sem;
	}

	public void setSem(Semester sem) {
		this.sem = sem;
	}
	
	public void enrolCourse(Course toAdd) {
		if(course.size()==0){
			return;
		}
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
		if(course.size()==0){
			return;
		}
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
		p.print();
		System.out.println(sem.name());
		for(int i = 0; i < courses.size();i++) {
			System.out.println();
		}
	}
	
	
}
