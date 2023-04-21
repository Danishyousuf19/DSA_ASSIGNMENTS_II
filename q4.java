import java.util.Scanner;


/*Define a class called product. Two instance variables of the class are (product-id) and 
price (product price). It consists of one static variable tot_price (total price). Initialize the value 
of instance variables through parameterized constructor. It consists of a display ( ) method to 
display the value of instance variables. A person went to market and purchase 5 different 
products. Using the above mentioned class, display the details of products that the person has 
purchased. Also, determine how much total amount the person will pay for the purchase of 5 
products. */

class negativenoo extends Exception{
	public String getMessage() {
		return "*ERROR* entered negative number";
	}
  
}
class product{
	int id,price;
	product(int id,int price)throws negativenoo{
		this.id=id;
		this.price=price;
		if(id<=0|price<0) {
			throw  new negativenoo();
		}
	}
	void display()
	{
		System.out.println("product id = "+this.id);
		System.out.println("price of one piece = "+this.price);
	}
	void total(int n) {
		
		System.out.println("total price for above  products = "+(n));
	}
}
public class q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
			product v[] =new product[5];
			for (int i=0;i<5;i++) {
				System.out.println("enter id and price of product");
				int x=sc.nextInt(),y=sc.nextInt();
				try {
					v[i]=new product(x,y);
					v[i].display();
					sum+=v[i].price;
					if(i==4) {
				
				product yy=new product(1,0);
				yy.total(sum);
			
					}
				} catch (negativenoo e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					break;
				}
				
			}
			
		
	}

}
