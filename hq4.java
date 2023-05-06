import java.util.Scanner;

/*A point in the x-y plane is represented by its x-coordinate and y-coordinate. Design a class,
PointType in Java, that can store and process a point in the x-y plane. You should then
perform operations on the point, such as showing the point, setting the coordinates of the
point, printing the coordinates of the point, returning the x-coordinate, and returning the ycoordinate. Every circle has a centre and a radius. Given the radius, we can determine the
circle’s area and circumference. Given the centre, we can determine its position in the x-y
plane. The centre of a circle is a point in the x-y plane. Design a class, CircleType that can
store the radius and centre of the circle. Because the center is a point in the x-y plane and
you designed the class to capture the properties of a point from PointType class. You must
derive the class CircleType from the class PointType. You should be able to perform the
usual operations on a circle, such as setting the radius, printing the radius, calculating and
printing the area and circumference, and carrying out the usual operations on the center*/
class point {
	int x;int y;
	void setcordinate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x coordinate");
		x=sc.nextInt();
		System.out.println("enter y cordinate");
		y=sc.nextInt();
	}
	void displaycordiante() {
		System.out.println("cordinate of center =  ("+x+","+y+")");
		
	}
	
}
class Circle extends point{
	
	int a2;int b2;
	int r;double dis;
	void getdat() {
		super.setcordinate();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter x cordinate of center of circle");
		a2=sc.nextInt();
		System.out.println("enter y cordinate of center of circle");
		b2=sc.nextInt();
		
	}
	void disp() {
		super.displaycordiante();
		int x1=(a2-x)*(a2-x);
		int y1=(b2-y)*(b2-y);
		 dis= Math.sqrt(y1+x1);
		 System.out.println("cordinate of center =  ("+a2+","+b2+")");
		 System.out.println("radius = "+dis);
		System.out.println("area of circle = "+(3.14*dis*dis));
		System.out.println("circumfance = "+(2*3.14*dis));
	}
	
}
public class hq4 {

	public static void main(String[] args) {
		Circle a=new Circle();
		a.getdat();
		a.disp();

	}

}
