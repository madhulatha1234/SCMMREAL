package Practice;

import java.util.Arrays;

public class newwwwwwww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]={9,2,8,4,6,7,9,8};
		int arrr[]= {7,9,0,8,7,6};
	      Arrays.sort(arr);
	      for(int i=0;i<arr.length;i++)
	      System.out.println(arr[i]);
boolean oo = Arrays.equals(arr,arrr);
if(oo) {
	System.out.println("annagram");
}
else {
	System.out.println("not annagram");
}
	}

}
