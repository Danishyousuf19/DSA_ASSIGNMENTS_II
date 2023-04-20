/*Define a class Deposit. The instance variable of the class Deposit are mentioned below.
Instance variable Datatype
Principal Long 
Time Integer
rate Double
Total_amt Double
Initialize the instance variables Principal, Time, rate through constructors. Constructors are 
overloaded with the following prototypes. 
Constructor1: Deposit ( )
Constructor2: Deposit (long, int, double)
Constructor3: Deposit (long, int)
Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are (i) display ( ): to display the 
value of instance variables, (ii) calc_amt( ) to calculate the total amount. 
Total_amt = Principal + (Principal×rate×Time)/100;
*/
class negative extends Exception{
   public String toString()	{
   
   return "*ERROR* entered negative number";
}
}
class deposit{
	 long Principal;
	 int Time;
	 double rate,Total_amt;
	 
	deposit(){
		System.out.println("i m default a constructor with no arg");
	}
deposit  (long Principal, int Time, double rate)throws negative{
	System.out.println("i m  a constructor with 3 arg");
	this.Principal=Principal;
	this.rate=rate;
	this.Time=Time;
	if(this.Time<0) {
		throw new negative();
	}
	}
deposit (long Principal, int Time ) throws negative{
	System.out.println("i m a constructor with 2 arg");
	this.Principal=Principal;
	this.Time=Time;
	if(this.Time<0) {
		throw new negative();
	}
}
deposit (long Principal, double rate){
	System.out.println("i m  a constructor with 2 arg");
	this.Principal=Principal;
	this.rate=rate;
}

void display() {
	System.out.println("time : "+Time);
	System.out.println("rate : "+rate);
	System.out.println("principal : "+Principal);
}
void total () {
	Total_amt = Principal + (Principal*rate*Time)/100;
	System.out.println("total amount = "+Total_amt);
}
}
public class q5 {

	public static void main(String[] args) {
		deposit my=new deposit();
        my.display();
        my.total();
        deposit my3;
		try {
			my3 = new deposit(1,2,3.5);
			my3.display();
        my3.total();
		} catch (negative e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
       
        deposit my2;
		try {
			my2 = new deposit(1,3);
			my2.display();
        my2.total();
		} catch (negative e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
      
        deposit my2_1=new deposit(1,3.0);
        my2_1.display();
        my2_1.total();
	}

}
