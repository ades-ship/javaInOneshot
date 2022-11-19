package javaInOneShot;
import java.util.*;
public class FirstClassJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println("adesh");
		//int float char string boolean
//		int age=18;
//		float a=12.4f;
//		char grade='w';
//		String name="adesh sengar";
//		System.out.println(name);
//		long bn=457347985345l;
		
//		int firstNUmber=12;
//		int secondNumber=67;
////		a++;
//		
//		double sum=(double)firstNUmber+(double)secondNumber;
//		System.out.println(sum);
	
//		
		Scanner sc=new Scanner(System.in);
//		int age = sc.nextInt();
//	      System.out.println(age);
//	      System.out.println("vxcjsdjz");
//	      if (age>18) {
//			System.out.println("you are eligible");
//		} else {
//			System.out.println("you are not eligible");
//		}
//		char grade='a';
//		if(grade=='a') {
//			System.out.println("grade a");
//		} else if (grade=='b') {
//			System.out.println("grade b");
//		} else {
//			System.out.println("invalid");
//		}
//		switch case
//		
//		char grade = 'b';
//		switch (grade) {
//		case 'a': {
//		   System.out.println("A");
//		   break;
//		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + grade);
//		}
		
//		
//		logical operators  ---->   and or  not
		
//		for (int i = 0; i <10; i++) {
//			System.out.println("adesh");
//		}
//		int a=10;
//		while(true)
//		{
//			System.out.println(a);
//			a++;
//		}
		
//		array;
//		int marks[]=new int[5];
//		for (int i = 0; i <5; i++) {
//			marks[i]=sc.nextInt();
//		}
//		
//		for (int i = 0; i <5; i++) {
//			System.out.println(marks[i]);
//		}
	  
//		methods
//		 
//		System.out.println(average(2,3));
	
		int marks[]=new int[2];
		marks[0]=12;
		marks[1]=23;
//		marks[2]=10;
	     try {
	    	 System.out.println(marks[2]);
	     } catch(Exception e) {
	    	 System.out.println("error aya tha ");
	    	 System.out.println(e.getLocalizedMessage());
	     }
	}

	static int average(int fn, int sn) {
		int sum=fn+sn;
		return sum/2;
	}
}
