package javaInOneShot;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    audi a1=new audi();
    bmw b1=new bmw();
    b1.start();
    a1.start();
	}
}
class audi extends Car {

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("audi is started");
	}
	
}

class bmw extends Car {

	@Override
	void start() {
		System.out.println("bmw started");
		
	}
	
}
	
abstract class Car {
	int price;
	abstract void start();
}