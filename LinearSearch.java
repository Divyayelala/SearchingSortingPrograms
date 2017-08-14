import java.util.Scanner;


public class LinearSearch {
	private void linearSearch(int[] a , int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			if(a[i] ==key)
			{
				System.out.println(key + " is found at index " +i);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		double [] a = new double[10];
		for (int i = 0; i < a.length; i++)
	    {
	        System.out.println("Please enter number");
	        a[i] = sc.nextDouble();
	    }*/
		int[] a = {2,4,6,8,10,12,14,16};
		LinearSearch ls = new LinearSearch();
		ls.linearSearch(a, 14);
		ls.linearSearch(a, 8);

	}



}
