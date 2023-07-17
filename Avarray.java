package dataStructrus;

public class Avarray {
	public static void main (String args[]) {
		int[] a= {69,40,20,9,6,100};
		int sum=0;
		double ave;
		for (int i=0;i<a.length;i++) {
			sum += a[i];
			
		}
		System.out.println(sum);
		ave= (double)sum/a.length;
		System.out.println(ave);
	}
}
