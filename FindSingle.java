import java.util.Scanner;
class FindSingle{
	public static int find(int[] arr){
		int res=arr[0];
		for(int i=1;i<arr.length;i++){
			res = res ^ arr[i];
		}
		return res;
	}
	public static void main(String []arg){
		int[] arr1 = {3,8,1,6,2,1,8,6,3};
		System.out.println(find(arr1));
	}
	


}