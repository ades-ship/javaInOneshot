package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		laptop l1=new laptop();
		l1.setPrice(56);
		laptop l2=new laptop();
		l2.setRam(100);
		System.out.println(l2.getRam());
	}
	
	public void dowork() {
	    System.out.println("do work");
	}
	
	
	
}
 

class laptop {
	int ram;
	private int price;
	
	public void setPrice (int price)
	{
		boolean isadmin=false;
		if(!isadmin) {
			System.out.println("you cant change the price");
		} else {
			System.out.println("you can change the price");
		}
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}
}