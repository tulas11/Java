//Create a class Person with data members as name, age, city. Write getters and setters for all the data 
//members. Also add the display function.Inside tester class invoke all the methods in that class. 

package package21;

import java.util.Scanner;

public class Person {
	Scanner sc = new Scanner(System.in);
	private String name;
	private int age;
	private String city;
	
	public Person() {
		this.name = "Default";
		this.age = 0;
		this.city = "Mumbai";
	}

	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getname() {
		return name;
	}

	public int getage() {
		return age;
	}

	public String getcity() {
		return city;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public void display() {
		System.out.println("Name: " + name + "Age: " + age + "City: " + city);
	}
	
	

}
