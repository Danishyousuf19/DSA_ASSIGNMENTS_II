package Ques10;
//Design a package that contains two classes Student & Test. The Student class has data
//members as name, roll and instance methods input ( ) & output ( ). Similarly the Test class
//has data members as mark1, mark2 and instance methods input ( ), output ( ), Student is
//extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
//Find grand total mark & score in another class.
import java.util.Scanner;

class STudent {
	int rollno;
	String name ;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name ");
		name=sc.next();
		System.out.println("enter rollno");
		rollno=sc.nextInt();
		
	}
	void output() {
		System.out.println("name : "+name+"\nroll no : "+rollno);
	}
}
public class test extends STudent {
int m1,m2,m3;
public static 	int total;
	public void input() {
		super.input();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of 3 subjects");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		total=m1+m2+m3;
	}
	public void output() {
		super.output();
		System.out.println("marks in subject 1 : "+m1);
		System.out.println("marks in subject 2 : "+m2);
		System.out.println("marks in subject 3 : "+m3);
	}
	public static void main(String[] args) {
		
		
	}

}
