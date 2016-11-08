package edu.neumont.csc110.d.people;

import Dahlen.Alex.people.Person;

public class PersonTester {

	public static void main(String[] args) {
		Person p = new Person();
		p.firstname = "Alex";
		p.lastname = "Dahlen";
		p.speak();
		
		printInt(5);
		dosomething(p);
	}

	public static void printInt(int x) {
		System.out.println(x);
	}
	
	public static void dosomething(Person p) { 
		System.out.println(p.firstname);
	}
}
