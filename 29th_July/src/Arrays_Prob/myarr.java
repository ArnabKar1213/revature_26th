package Arrays_Prob;
import java.util.*;
public class myarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		//int n1 =sc.nextInt();
		//System.out.println("Enter the index at which you want to find the maximum element");
		//max(n1,arr);
		//pal(arr);
		//dup(arr,n);
		//prime(arr);
		//fl(arr);
	}
	/*public static void max(int n1,int arr[]) {
		System.out.println(arr[n1-1]);
	
	}
	public static void pal(int arr[]) {
		int sum=0,temp=0,r=0;
		for(int t:arr) {
			temp=t;
			//System.out.print(temp + " ");
			while(t>0) {
				r=t%10;
				sum=(sum*10) + r ;
				t=t/10;
			}
			if(temp==sum)
				System.out.print(temp + " ");
		}
	}
	public static void dup(int arr[],int n) {
		int temp[] = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
			temp[j]=arr[n-1];
		
		for(int t:temp)
			if(t!=0)
		System.out.print(t+" ");

}
	public static void prime(int arr[]) {
		int flag,m;
		for(int t:arr) {
			flag=0;
			m=t/2;
			if(t==0 || t==1)
				continue;
			for(int i=2;i<=m;i++) {
				if(t%i==0) {
					//System.out.println(t+" is not prime number");      
      
					flag++;
				break;
				}
			}
			if(flag==0)
				System.out.print(t + " ");
		
	}
 }*/
	public static void fl(int arr[],int n) {
		int r;
		for(int i=0;i<n;i++) {
			r=arr[i]%10;
			int t=arr[i];
					while(t>0) {
						//r=t%10;
						t=t/10;
					}
					t=t*10;
					if(t==r)
						arr[i]=0;
					//System.out.print(arr[i] + " ");
		}
		for(int t:arr) {
			if(t!=0)
			System.out.print(t + " ");
	}
	}
}
//22,34,67,88,99
//0,1,2,3,4