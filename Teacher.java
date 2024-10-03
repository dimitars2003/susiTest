package test;

public class Teacher extends Person {
	Department dp;
	
	public Teacher() {
		super();
		dp = Department.ComputerScience;
	}
	
	public Teacher(String name, int age, Department dp) {
		super(name,age);
		this.dp = dp;
	}

	public Department getDp() {
		return dp;
	}

	public void setDp(Department dp) {
		this.dp = dp;
	}
	
	public void print() {
		super.print();
		System.out.println(dp.name());
		
	}
	
}
