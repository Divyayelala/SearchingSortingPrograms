
public class BinarySearch {
	private void binarySearch(int[] a, int key) {
		int start = 0 , end = a.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(key == a[mid])
			{
				System.out.println(key + "  : is at [" +mid + "]th position");
			}
			if(key<a[mid])
			{
				end = mid-1;
			}
			else
			{
				start = mid+1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,6,8,10,12,14,16};
		BinarySearch bs = new BinarySearch();
		bs.binarySearch(a , 10);
		

	}



}
