package test;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		name = "kircho";
		age = 40;
	}
	
	
	public Person (String name,int age) {
		this.name = name;
		this.age = age;
		
	}


	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
	
}
