import java.util.Scanner;

/*Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class 
consists of instance methods getdata( ), showdata( ) to provide input to the instance variable 
and to display the value of instance variable. Write a program to create the details of 5 students. 
Display the information of the students who has secured the highest DSA_Mark.*/
class bad extends Exception{
	   public String toString()	{
	   
	   return "*ERROR* entered invalid number";
	}
	   public String getMessage() {
		return "*ERROR* entered invalid number";
		   
	   }
	}
	class SStudent {
		int rollno,dsa_marks;
		String name;
		void setdata() throws bad{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your roll no , name and dsa marks ");
			
			rollno=sc.nextInt();
			name=sc.next();
			dsa_marks=sc.nextInt();
			if(rollno <=0|dsa_marks<0) {
				throw new bad();
			}
		}
		void getdata() {
			System.out.println("roll no : "+rollno);
			System.out.println("name : "+name);
			System.out.println("dsa marks : "+dsa_marks);
			
		}
		
	}
	public class q3 {
		
	 static int maxmark(int a[]) throws bad {
		 
		 
		int flag=0,max=-1;
		for(int i=0;i<5;i++) {
			if(a[i]<=0)
				throw new bad();
			else if(a[i]>max) {
				max=a[i];
				flag=i;
			}
			
		}
		System.out.println("details of student with maximum marks are :");
		return flag;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 SStudent s[]=new SStudent[5];
	 int arr[]=new int[5];
	 for(int i=0;i<5;i++) {
		 s[i]=new SStudent();
		 try {
			s[i].setdata();
			s[i].getdata();
			 arr[i]=s[i].dsa_marks;
				
		} catch (bad e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			break;
		}

		
		
	 }
		 try {
			
			 s[maxmark(arr)].getdata(); ;
		 }
		 catch(bad e) {
			 System.out.println(e.toString());
		 }
	 
			
	 
	  
		}

	}
