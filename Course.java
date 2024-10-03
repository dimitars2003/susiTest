package test;
import java.util.List;

public class Course {
	private String name;
		private Teacher teacher;
	private List<Teacher> assistants;
	private Department dp;
	
	public Course(String name,  Teacher teacher, List<Teacher> assistants,Department dp) {
		this.name = name;
		
		this.teacher = teacher;
		this.assistants = assistants;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Teacher> getAssistants() {
		return assistants;
	}

	public void setAssistants(List<Teacher> assistants) {
		this.assistants = assistants;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println("head" + teacher);
		
		
		for(int i = 0; i < assistants.size();i++) {
			assistants.get(i).print();
			
		}
		System.out.println(dp);
		
	}
	
	
	
}
