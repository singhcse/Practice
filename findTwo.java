class FindTwo{
	
	
	public static void main(String []arg){
		int[] arr={2,5,2,8,1,3,8,3,5};
		int result=0;
		for(int i=0;i<arr.length;i++){
			result ^= arr[i];
			System.out.println(result);
		}
		
	}
}