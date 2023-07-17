package dataStructrus;
import java.util.*;
class solution{
	public void  count_num_finger(int a) {
		int y=0;
		int r = a % 8;
		    y= 10 - r;
		if (r == 0) {
			System.out.println(2);
		if (r < 5)
			System.out.println(r);
		else
		    return;
		}
		if (y==1)
			System.out.println("thumb finger");
		if (y==2)
			System.out.println("index finger");
		if (y==3)
			System.out.println("midlie finger");
		if (y==4)
			System.out.println("ring finger");
		if  (y==5)
			System.out.println("pinky");
		return;
	}
}
public class Shree{
public static void main(String args[]) {
	try (Scanner sc = new Scanner(System.in)) {
		int n =sc.nextInt();
		solution si = new solution();
		si.count_num_finger(n);
	}
}
}
