import java.util.Scanner;

/*Define a class called product. Two instance variables of the class are pid (product-id) and 
price (product price). It consists of one static variable tot_price (total price). Initialize the value 
of instance variables through parameterized constructor. It consists of a display ( ) method to 
display the value of instance variables. A person went to market and purchase 5 different 
products. Using the above mentioned class, display the details of products that the person has 
purchased. Also, determine how much total amount the person will pay for the purchase of 5 
products. */
class negative extends Exception{
   public String toString()	{
   
   return "*ERROR* entered negative number";
}
}
class product{
	int id,price;
	product(int id,int price)throws negative{
		this.id=id;
		this.price=price;
		if(id<=0|price<0) {
			throw  new negative();
		}
	}
	void display()
	{
		System.out.println("product id = "+this.id);
		System.out.println("price of one piece = "+this.price);
	}
	void total(int n) {
		System.out.println("total price for "+n+" products = "+(n*this.price));
	}
}
public class q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id and price of product");
		int x=sc.nextInt(),y=sc.nextInt();
		try {
			product vico =new product(x,y);
			System.out.println("enter number of items");
			int z=sc.nextInt();
			vico.display();
			vico.total(z);
		} catch (negative e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

}
