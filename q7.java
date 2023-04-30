import java.util.Scanner;

//Define a base class Person with instance variable name, age. The instance variables are 
//initialized through constructors. The prototype of constructor is as below.
//Person (string, int)
//Define a derived class Employee with instance variables Eid, salary. The instance variables 
//are initialized through constructors. The prototype of constructor is as below.
//Employee (string, int, int, double). Another instance method of Employee class is empDisplay() 
//to display the information of employee details.

class person{
	String name;
	int age;person(String n,int a){
		name=n;
		age=a;
	}
	
}
class employee extends person{
int eid;
double salary;
	employee(String n, int a,int e,double s) {
		super(n, a);
		eid=e;salary=s;
	}
	void display() {
		System.out.println("name = "+name);
		System.out.println("id = "+eid);
		System.out.println("age = "+age);
		System.out.println("salary = "+salary);
	}
}
public class q7 {

	public static void main(String[] args) {
		System.out.println("enter your name , age , id , salary");
		Scanner sc=new Scanner (System.in);
		String n=sc.next();
		int a=sc.nextInt();
		int e=sc.nextInt();
		double s =sc.nextDouble();
		employee nue =new employee(n,a,e,s);
		nue.display();

	}

}
