package javaInOneShot;

public class Interfaces implements vehicle , men{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Interfaces i=new Interfaces();
      i.start();
      i.walk();
      }

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("starting....");
	}

}

interface vehicle {
	void start();
}

interface men{
	void walk();
}