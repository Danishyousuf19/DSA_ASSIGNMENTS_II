
/*Define a class called Complex with instance variables real, imag and instance methods
setData(), display(), add(). Write a Java program to add two complex numbers.
The prototype of add method is: 
public Complex add(Complex, Complex).
*/
import java.util.Scanner;

class complexNo{
	int realpart;
	int imagnarypart;
	
	void setdata() {
		System.out.println("enter real and imagnary part of complex number");
		Scanner sc=new Scanner(System.in);
		realpart=sc.nextInt();
		imagnarypart=sc.nextInt();
		
	}
	
	void result() {
		System.out.println(realpart+" +i"+imagnarypart);
	}
	
	public complexNo Add(complexNo a ,complexNo b) {
		complexNo c=new complexNo();
		c.realpart=a.realpart+b.realpart;
		c.imagnarypart=a.imagnarypart+b.imagnarypart;
		return c;
		
	}
	///   THIS KEYWORD
	public complexNo SIMPLEADD(complexNo a ,complexNo b) {
		
		realpart=a.realpart+b.realpart;
		imagnarypart=a.imagnarypart+b.imagnarypart;
		return this;
		
	}
	
	
}

public class q2 {

	public static void main(String[] args) {
		complexNo x=new complexNo();
		x.setdata();
		complexNo y=new complexNo();
		y.setdata();
		complexNo z=new complexNo();
	   z= z.Add(y, x);
	    z.result();
	    //other way
	    z.SIMPLEADD(x, y);
	    z.result();
	
	
	}
	

}
