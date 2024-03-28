//Vehicle Class with Default and Parameterized Constructors: Design a Vehicle class with attributes
//like make, model, and year. Implement both default and parameterized constructors. Write a
//program to create instances of Vehicle using these constructors and display their details.

import java.util.Scanner;
class Test{
	String model;
	int year;
	int since;
	Test(String model,int year,int since){
		this();
		System.out.println("PARAMETRIZED CONSTRUCTORS");
		this.model=model;
		this.year=year;
		this.since=since;
	}
	Test()
	{
		System.out.println("Default class");
		Scanner s =new Scanner(System.in);
		System.out.println("print year");
		int year = s.nextInt();
		System.out.println(year);
	}
}
class vechicle{
	public static void main(String args[]){
		Test s1 = new Test("Thar",2024,2000);
		System.out.println(s1.model+" "+s1.year+" "+s1.since+" ");
	}
}


Output:Default class
       print year
       1234
       1234
       Thar  2024  2000
