
public class LargestElement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,2,4,6,8,10,12};
		int max;
		max = a[0];
		for(int i=0;i<a.length;i++)
		{
            if(max < a[i])
            {
                max = a[i];
            }
		}
		System.out.println(max+ " largest");	
	}
}
