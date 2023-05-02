import java.util.Scanner;

//Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
//contains a static data member maxcount, instance member name & method display ( ) to display 
//name of a person, count the no. of characters present in the name of the person

interface DetailInfo{
	void display();
	int count();
	
}
class Person implements DetailInfo{
	String name;
	public Person(String x){
		this.name=x;
	}



static void maxcount() {
	
}
	@Override
	public void display() {
		
		System.out.println("name = "+name);
		System.out.println("number of charactres = "+count());
	}

	@Override
	public int count() {
		int c=name.length();
		return c;
		
	}
	
}

public class Q8 {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		Person x=new Person(name);
		x.display();

	}

}
