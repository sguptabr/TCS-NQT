package codechef;

import java.util.*;

public class Vincet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		
		
		for(int i=2;i<N;i++)
		{
			count = 0;
			for(int j=1;j<N;j++)
			{
				if(i%j == 0)
				{
					count++;
				}
				
			}
			
			if(count == 2)
			{
				System.out.print(i+" ");
			}
			
		}
		
	}

}
