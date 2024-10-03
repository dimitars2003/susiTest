package test;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Misho",11,Semester.Fourth);
		
		Teacher t1 = new Teacher("Pesho",44,Department.DiscreteMaths);
		Teacher t2 = new Teacher("Mesho",44,Department.DiscreteMaths);
		Teacher t11 = new Teacher("Gesho",44,Department.ComputerScience);
		List<Teacher> tarr = new ArrayList<Teacher>();
		tarr.add(t2);
		tarr.add(t11);
		
		Course c1 = new Course("Dis",t1,tarr,Department.DiscreteMaths);
		Course c2 = new Course("Alg",t2,tarr,Department.Calculus);
		List<Course> carr = new ArrayList<Course>();;
		carr.add(c2);
		carr.add(c1);
		
		Susi susi = new Susi(carr,s1);
		susi.getCourseInfo();
		susi.enrollMe();
		susi.getMyData();
		
		
	}

}
