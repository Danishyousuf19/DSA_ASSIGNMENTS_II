/*A sales person is paid commission based on the sales he makes as shown by the following
table:
SALES COMMISSION
Under Rs. 100 2% of SALES
Rs 500 and under Rs 5000 5% of Sales
Rs 5000 and above 8% of sales
Write a class, Commission, which has:
 An instance variable, sales; an appropriate constructor; and a method, getCommission()
that returns the commission.
Now write a Demo class in Java to test the Commission class by reading a sale from the
user, using it to create a Commission object after validating that the value is not negative.
Finally, call the getcommission() method to get and print the commission. 
If the sales are negative, your Demo class should print the message “Invalid Input”*/

class commision {
	int sales;
	commision(int sales){
		this.sales=sales;
		
	}
	double getcommision() {
		if(sales<500) {
		return .02*sales;
		}
		else if(sales<5000) {
			return (.02*500)+(.05*(sales-500));
		}
		return (.02*500)+(.05*4500)+(.08*sales-5000);
	}
}
class demo extends commision{

	demo(int sales) {
		super(sales);
		
	}
	void check() {
		if (sales<0) {
			System.out.println("invalid sales");
		}
		else {
			commision s=new commision(sales);
			
			System.out.println(s.getcommision());
		}
	}
	
}

public class hq1 {
public static void main (String []a) {
	demo x=new demo(-100);
	x.check();
}

}
