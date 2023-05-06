package Ques10_B;
import Ques10.test;
interface sport {
	int s1=78;
	int s2=89;
}

public class q10_b extends test implements  sport {
void display() {
	super.output();
	int gt=s1+s2+total;
	System.out.println("marks in sport  1 : "+s1);
	System.out.println("marks in sport  2 : "+s2);
	System.out.println("total marks : "+gt);
}
	public static void main(String[] args) {
		q10_b t=new q10_b();
		t.input();
		t.display();
	}

}
