import java.util.*;

class BubbleImp{
	public static void bubble(int[] arr){
		int n = arr.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String []arg){
		int[] arr={2,14,3,8,32,0,64,04};
		bubble(arr);
		for(int a : arr) System.out.print(a +" ");
	}
}