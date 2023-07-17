package dataStructrus;
import java.util.Arrays;

public class TwosorArray {
	
	public static int[]  MergedArray(int a[],int b[]) {
		int[] c = new int [a.length+b.length];
		/*int q=a.length;
		if (a.length>b.length) {
			q=b.length;
		}
		for (int i=0;i<q;i++) {
        //cibi solution
		c[i]=a[i];
		c[i+a.length]=b[i];
		}*/
		int index=0;
		for (int i=0;i<a.length;i++) {
			c[index]=a[i];
			index++;
		}
		// madhu solution
		for (int i=0;i<b.length;i++) {
			c[index]=b[i];
			index++;
		}
		return c;
	}	
	public static void main (String args[]) {
		int A[]= {1,4,6,9,7};
		int B[]= {8,9,5,7};
		int[] c = MergedArray(A,B);
		System.out.print("merged_array: " );
		for (int i:c) {
			System.out.print(i +" ");
         
		}
	    
	}
}
