	//check duplicate element in array [1,2,3,2,5]
	import java.util.Scanner;
	class p1{
		public static void main(String args[]){
			int search=2;
			int count=0;
			Scanner sc=new Scanner(System.in);
				int  arr[]={1,2,3,2,5};
			for(int i=0;i<arr.length;i++){
				if(arr[i]==search){
				count++;
						}
							}
				System.out.println("count is "+count);
					}
			}


		//o/p:count is 2