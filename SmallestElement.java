
public class SmallestElement {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {13,56,2,4,6,8,10,12};
		int min;
		min = a[0];
		for(int i=0;i<a.length;i++)
		{
            if(min>a[i])
            {
            	min = a[i];
            }
		}
		System.out.println(min+ " smallest");	
	}

}
