package test;

public class Person {
	private String name;
	private String username;
	private String pass;
	private int age;
	
	public Person() {
		name = "kircho";
		username = "kircho";
		pass = "1234"
		age = 40;
	}
	
	
	public Person (String name,String username,String pass, int age) {
		this.name = name;
		this.username = username;
		this.pass = pass;
		this.age = age;
		
	}


	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}


	//public void setUserName(String username) {
	//	this.username = username;
	//}//trqbva li

	public String getPass() {
		return pass;
	}


	//public void setPass(String pass) {
	//	this.pass = pass;
	//}//trqbva li

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
