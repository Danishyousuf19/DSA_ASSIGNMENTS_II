import java.util.Scanner;

//Write a Java program to declare a Class named as Student which contains roll number,
//name and course as instance variables and input_Student () and display_Student () as
//instance methods. A derived class Exam is created from the class Student. The derived
//class contains mark1, mark2, mark3 as instance variables representing the marks of three
//subjects and input_Marks () and display_Result () as instance methods. Create an array of
//objects of the Exam class and display the result of 5 students

class Student {
	int rollno;String name;
	String course;
	void input()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your name , rollno , course");
		name=sc.next();
		rollno=sc.nextInt();
		course=sc.next();
	}
	void display(){
		System.out.println("rollno = "+rollno);
		System.out.println("name = "+name);
		System.out.println("course = "+course);
	}
	
}
class exam extends Student{
	int m1,m2,m3;
	void setmarks()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter masrks of 3 subjects ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();;

	}
	void result() {
		System.out.println(" marks = "+(m1+m2+m3));
	}
}
public class Q9 {

	public static void main(String[] args) {
		exam s[]=new exam[5];
		for(int i=0;i<5;i++) {
			s[i]=new exam();
			s[i].input();
			s[i].setmarks();
			System.out.print("student "+(i+1)+" have ");
			s[i].result();
		}

	}

}
