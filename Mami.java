package dataStructrus;

public class Mami {
	public static void main (String args[]) {
		int[] a= {69,89,100,11,12};
		int max = 0;
		int min = 0;
		for (int i=0;i<a.length;i++)
			for (int k=1;k<a.length;k++) {
				max = Math.max(a[i],a[k]);
				min=Math.min(a[i],a[k]);
				System.out.println("ma"+max);
				System.out.println("mi"+min);
			}
		System.out.println("max value is " + max);
		System.out.println("min value is " + min);
	}
}
/* CHAT GPT Says 
 * There are a couple of errors in your code.


The initialization of max and min should not be set to 0. Since the array contains positive numbers, setting max and min to 0 will cause incorrect results. Instead, you can initialize max with the first element of the array and min with the same value initially.

The nested for loop is not required. You only need a single loop to iterate over the array elements.

Here's the corrected code:

java
Copy code
package dataStructures;

public class Mami {
    public static void main(String args[]) {
        int[] a = {69, 89, 100, 11, 12};
        int max = a[0]; // Initialize max with the first element of the array
        int min = a[0]; // Initialize min with the first element of the array

        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        System.out.println("Max value is: " + max);
        System.out.println("Min value is: " + min);
    }
}
Output:

csharp
Copy code
Max value is: 100
Min value is: 11
In the corrected code, I have made the following changes:

Initialized max with a[0] (the first element of the array) and min with the same value.
Used a single loop to iterate over the array from index 1 onwards.
Inside the loop, updated max and min using the Math.max() and Math.min() methods, respectively.
Printed the maximum and minimum values outside the loop.
These changes will give you the correct maximum and minimum values from the array.
*/