package test;
import java.util.List;

import java.util.Scanner;

public class SusiNew{
  private List<Person> admins;
  private List<Students> students;
  private List<Teacher> teachers;

  private List<Course> courses;

  private StudentCourseLinker linker;

  public SusiNew(){
    admins = new ArrayList<Person>();
    //...
  }
  
  public void addAdmin(const Admin& admin){
    admins.push(admin);
  }
  
  public void createCourse(){//vzima neshta ot konzolata i sazdava kurs
    Course newC = new Course();//za sega prosto dobavq deff kato se napravi console reader shte poluchava info
    courses.push(newC);
  }

  public void createTeacher(){//vzima neshta ot konzolata i sazdava kurs
    Teacher newT = new Teacher();//za sega prosto dobavq deff kato se napravi console reader shte poluchava info
    teachers.push(newT);
  }

  public void createStudent(){//vzima neshta ot konzolata i sazdava kurs
    Student newS = new Student();//za sega prosto dobavq deff kato se napravi console reader shte poluchava info
    students.push(newS);
  }
  
  public void enrollStudent() { //vzima koi student i koi kurs
		linker.addStudentToCourse(1,1);//poluchava data ot console reader
		//Scanner in = new Scanner(System.in); // trqbva da otide v console reader
		//int n = in.nextInt();
		//pokazva spisak s kursove
		//proverka dali e uchitel/asistent?? v kursa
		//izbira kurs
		//pokazva spisak s studenti
		//potrebitel izbira koi da zapishe
		//currStudent.enrolCourse(courses.get(n));
		
		//in.close();
	}  

  public void removeStudent() { //vzima koi student i koi kurs
		linker.removeStudent(1,1);//poluchava data ot console reader
    
    //Scanner in = new Scanner(System.in);// trqbva da otide v console reader  
		//int n = in.nextInt();
		//pokazva spisak s kursove
		//izbira kurs
		//proverka dali e uchitel/asistent?? v kursa
		//pokazva spisak s studenti
		//potrebitel izbira koi da zapishe
		//currStudent.leaveCourse(courses.get(n));
		//in.close();
	}

  public void addGrade(){//vzima na koi student na koi kurs i kakva ocneka i vika funkciq na linker
    linker.addGrade(1,1,1);//poluchava data ot console reader
  }

  public void passStudent(){//vzima na koi student i koi kurs minava
    linker.passStudent(1,1);//poluchava data ot console reader
  }

  public void createSpecialty(){//v momenta e enum -> trqbva da se preraboti na klas ili da se zapisvat zaqvki
    
  }

  public void enrollFreePickCourse(){//da se dobavi v course dali kursa e zadaljitelen ili izbiraem
    linker.addStudentToCourse(1,1); // poluchava data ot console reader  
    
  }
  
};
