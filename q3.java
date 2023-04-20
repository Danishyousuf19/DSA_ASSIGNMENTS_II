import java.util.Scanner;

/*Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class 
consists of instance methods getdata( ), showdata( ) to provide input to the instance variable 
and to display the value of instance variable. Write a program to create the details of 5 students. 
Display the information of the students who has secured the highest DSA_Mark.*/
class negative extends Exception{
   public String toString()	{
   
   return "*ERROR* entered negative number";
}
}
class student {
	int rollno,dsa_marks;
	String name;
	void setdata() throws negative{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your roll no , name and dsa marks ");
		
		rollno=sc.nextInt();
		name=sc.next();
		dsa_marks=sc.nextInt();
		if(rollno <=0|dsa_marks<0) {
			throw new negative();
		}
	}
	void getdata() {
		System.out.println("roll no : "+rollno);
		System.out.println("name : "+name);
		System.out.println("dsa marks : "+dsa_marks);
		
	}
	void maxmark(int arr[]) {
		int x=arr.length;
		int max =-1;
		for(int i=0;i<x;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("maximum marks = "+max);
	}
}

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 student s[]=new student[5];
 int arr[]=new int[5];
 for(int i=0;i<5;i++) {
	 s[i]=new student();
	 try {
		s[i].setdata();
		s[i].getClass();
	 arr[i]=s[i].dsa_marks;
	} catch (negative e) {
		// TODO Auto-generated catch block
		System.out.println(e.toString());
		break;
	}
	
 }
 student sd=new student();
 sd.maxmark(arr);
  
	}

}
