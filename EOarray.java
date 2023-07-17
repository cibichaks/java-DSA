package dataStructrus;

public class EOarray {
	public static void main(String args[]) {
		int[] a = {1,4,5,7,52,81,69};
		int even=0;
		int odd=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("even number count is "+ even );
		System.out.println("odd numbers count is "+odd);
	}
	
}
