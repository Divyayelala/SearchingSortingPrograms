
public class SelectionSort {

	void selectionSort(int[] a) {
		
		 for (int i = 0; i < a.length; i++)
		 {
	            System.out.print(a[i] + ", ");
	     }
		 System.out.println("-----------");
		for(int i= 0; i <a.length-1; i++)
		{
			int min = i;
			for(int j = i+1;j<a.length;j++)
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
					int t = a[min];
					a[min] =a[i];
					a[i] = t;
					 for (int k = 0; k < a.length; k++)
				        {
				           System.out.print(a[k] + ", ");
				       	}
					 System.out.println();
				}			
	}
	
	void printNumbers(int[] input) {
       
       for (int i = 0; i < input.length; i++) {
           System.out.print(input[i] + ", ");
       }
       System.out.println("\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,60,35,2,45,320,5};
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(a);

	}

}
