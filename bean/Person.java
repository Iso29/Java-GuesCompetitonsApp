package bean;

import java.io.Serializable;

public abstract class Person implements Serializable{
	private String name;
	private String surname;
	private String eMail;
	private int age;
	
	Person(String name, String surname, String eMail, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.eMail = eMail;
		this.age = age;
	}
	
	Person(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
