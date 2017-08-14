import java.util.Arrays;


public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,2,4,6,8,10,12};
		System.out.println(Arrays.toString(a));
		int temp;
		for (int i = 0; i < a.length/2; i++) 
		{
				temp = a[i];
				  a[i] = a[a.length-1-i];
				  a[a.length-1-i] = temp;
			}
		System.out.print( Arrays.toString(a));

		}

}
