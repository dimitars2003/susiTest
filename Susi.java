package test;
import java.util.List;

import java.util.Scanner;

//trqbva console manager koito polzva susi

//Student i teacher get za user

//sazdavane na kurs - teacher ili admin
//dobavqne na asistenti - teacher ili admin

public class Susi {
	private List<Course> courses;// ima li ocenka - samo teacher moje da pishe - deff stoinost 2/0 - double ili int?
	//ima li passed - samo teacher moje da pasva (funkciq pri vikane gleda ocenki smqta sredno i ako e >2.99 minava)
	//? kursovete darjat zapisani studenti
	// cap na zapisani
	//
	private Student currStudent;//list
	//cap za kolko kursa zapisani
	
	// list teachers
	//admin class - ima person ima dostap do vsichko ?dobavqne na uchiteli?
	//proverki za curr user
	//dobavqne na currUser
	//inteface za neshta na student i neshta na teacher (admin ima i dvete?)

	//list admin
	public Susi(List<Course> courses, Student curr) {
		this.courses = courses;
		currStudent = curr;
		
	}

	//private finkcii za proverki?
	
	//what am i funkciq

	
	//create student - pri log in i log out? koi sazdava studenta - admin ili user koito se logva
	//proverka za veche takiva useri?
	
	//log in 
	//2 variant
	// - izbor kakvo si i togava logvane - tova ???
	// direktno logvane i tarsi prez vsichko
	
	// log out
	//trqbva li da sa otdelen klas
	
	public void enrollMe() { //ako si admin/teacher mogat asistenti da go pravqt ili samo headteacher
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//pokazva spisak s kursove
		//proverka dali e uchitel/asistent?? v kursa
		//izbira kurs
		//pokazva spisak s studenti
		//potrebitel izbira koi da zapishe
		currStudent.enrolCourse(courses.get(n));
		
		in.close();
	}
	
	public void removeMe() { // ako si admin/teacher mogat asistenti da go pravqt ili samo headteacher
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//pokazva spisak s kursove
		//izbira kurs
		//proverka dali e uchitel/asistent?? v kursa
		//pokazva spisak s studenti
		//potrebitel izbira koi da zapishe
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
	//add course
	
	//
	
}
