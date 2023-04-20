import java.util.Scanner;

/*A phone number can be thought of as having three parts: the area code, the exchange code and 
the number. 
Example: A phone number, such as (212) 767-8900, can be thought of as having three parts: 
the area code (212), the exchange (767) and the number (8900).
Define a class Phone to store these three parts of a phone number separately as instance 
variable (area_code, exchange, number). The class consists of two member methods: input ( )
and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.) 
operator and instance variable with value area_code: 212, exchange: 767, 
number: 8900), and initialize other from the user through member method input ( ). Display 
both the numbers.
*/
class negativeno extends Exception{
	public String getMessage() {
		return "*ERROR* Entered negative number ";
		
	}
}
class phone{
	int area_code,exchange,number;
	void input()throws negativeno {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your areacode,the exchange and the number");	
		area_code=sc.nextInt();
		exchange=sc.nextInt();
		number=sc.nextInt();
		if(area_code <=0|exchange<=0|number<=0) {
			throw new negativeno();
		}
	}
	void display(phone my ,phone your) {
		System.out.println("my number is ");
		System.out.println("("+my.area_code+")"+my.exchange+"-"+my.number);
		System.out.println("your number is ");
		System.out.println("("+your.area_code+")"+your.exchange+"-"+your.number);
	}
}


public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
phone my =new phone();
my.area_code=212;
my.exchange=767;
my.number=8900;
phone your =new phone ();
try {
your.input();
phone display =new phone();
display.display(my, your);}
catch(negativeno e) {
	System.out.println(e.getMessage());
}

//other way
//your.display(my, your);
	}

}
//My number is (212) 767-8900
//Your number is (415) 555-1212
