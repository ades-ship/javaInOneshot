package javaInOneShot;

import encapsulation.EncapsulationIntro;

public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello");
//		person p1=new person();
//		p1.age=20;
//		p1.name="adesh";
//		System.out.println(p1.age + " "+ p1.name);
//		person p2=new person();
//		p2.age=40;
//		p2.name="gaurav";
//		System.out.println(p2.age + " "+ p2.name);
//		p1.walk();
//		p1.walk(30);
//		
//		person p1=new person(20,"adesh");
//		System.out.println(person.count);
//		p1.walk();
//		p1.walk(40);
//		developer d1=new developer(39,"nitish");
//		d1.walk();
		EncapsulationIntro e=new EncapsulationIntro();
		e.dowork();
		}

}

class developer extends person {
	
	public developer(int age , String name) {
		super(age,name);
	}
}

class person {
	 String name;  // properties;
	int age;   // properties;
	static int count;
	public person() {
		System.out.println("new constructor");
		count++;
	}
	public person(int nage, String nname) {
		this();  // used to call default constructors;
		age=nage;
		name=nname;
	}
//	this is behaviours/methods;
	  
	 // this is polymorphism 
	void walk() {
		System.out.println(name + " is walking");
	}
	void  walk(int steps) {
		System.out.println(name+ " walked " + steps);
	}
	
}