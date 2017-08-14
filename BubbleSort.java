
public class BubbleSort {
	void bubblesort(int[] a) {
	boolean swap= false;
		 for (int i = 0; i < a.length; i++)
		 {
	            System.out.print(a[i] + ", ");
	        }
		 System.out.println("-----------");
		for(int i= 0; i <a.length-1; i++)
		{
			for(int j = 0;j<a.length-1;j++)
			{
				
				if(a[j] > a[j+1])
				{
					int t = a[j];
					a[j] =a[j+1];
					a[j+1] = t;
				}
		}
			 for (int k = 0; k < a.length; k++)
		        {
		           System.out.print(a[k] + ", ");
		       	}
		       	System.out.println();
			
		}			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,60,35,2,45,320,5};
		BubbleSort bs = new BubbleSort();
		bs.bubblesort(a);
	
		
	}

}