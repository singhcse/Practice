import java.util.*;

class fib{
	
public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 0 || a== 1){
			System.out.println(0);
		}
        else if(a == 2 || a == 3){
			System.out.println(1);
		}	
		
		else if(a>3){
        int[] arr = new int[a];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=a-1;i++){
             arr[i] = arr[i-1]+arr[i-2];
            if(i == (a-1)){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
	
}	