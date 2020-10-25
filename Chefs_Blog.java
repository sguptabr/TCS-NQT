package codechef;

import java.util.Scanner;

public class Chefs_Blog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
		int T = sc.nextInt();
		
		while(T!=0) 
		{
			T = T -1;
			System.out.println("Please Enter the number fo days: ");
			int n = sc.nextInt();
			System.out.println("Enter min number of quetions to be anwered: ");
			int k = sc.nextInt();
			
			int[] quetions = new int[n];
			
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter number of quetions asked at "+i+"th day : ");
				quetions[i] = sc.nextInt();
			}
			
			int count =0;
			int j=0;
			int count1=0;
			
			for(int i=0;i<n;i++)
			{
				
				int x = quetions[i];
					if((x-k)>k) 
					{
						count = count + (x-k);
					}
					System.out.println("To be anwered : "+count);
					count1++;
					System.out.println(count1);
			}
			
			while(count!=0)
			{
				count = count - k;
				j++;
				System.out.print(j);
			}
		}
		
	}

}
