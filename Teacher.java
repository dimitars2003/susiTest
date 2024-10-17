package test;

public class Teacher {
	Department dp;
	Person p
	
	public Teacher() {
		p = new Person();
		dp = Department.ComputerScience;
	}
	
	public Teacher(String name, int age, Department dp) {
		p = new Person(name,age);
		this.dp = dp;
	}

	public Department getDp() {
		return dp;
	}

	public void setDp(Department dp) {
		this.dp = dp;
	}
	
	public void print() {
		p.print();
		System.out.println(dp.name());
		
	}
	
}
