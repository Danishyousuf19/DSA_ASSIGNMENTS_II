import java.util.Scanner;

/*Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a
java program to display area of different shapes*/
abstract class shape {
	int side,hight;
	abstract void area() ;
	abstract void setdata() ;
}
class square extends shape{

	@Override
	void area() {
		System.out.print("area of square = "+side*side);
		System.out.println(" units");
	}

	@Override
	void setdata() {
		System.out.println("enter length of sides");
		Scanner sc=new Scanner(System.in);
		side=sc.nextInt();
		
	}
	
}
class circle extends shape{

	@Override
	void area() {
		double a=(3.14*side*side);
		System.out.printf("area of circle = %1.4f",a);
		System.out.println(" units");
	}
	@Override
	void setdata() {
		System.out.println("enter radius of circle");
		Scanner sc=new Scanner(System.in);
		side=sc.nextInt();	
		
	}
	
}
class triangle extends shape{

	@Override
	void area() {
		System.out.print("area of triangle = "+.5*side*hight);
		System.out.println(" units");
	}
	@Override
	void setdata() {
		System.out.println("enter length and hight of triangle");
		Scanner sc=new Scanner(System.in);
		side=sc.nextInt();
		hight=sc.nextInt();
		
	}
	
}

		

public class q6 {

	public static void main(String[] args) {
		square x=new square();
		x.setdata();
		x.area();
		
		circle x2=new circle();
		x2.setdata();
		x2.area();
		
		triangle x3=new triangle();
		x3.setdata();
		x3.area();
	}

}
