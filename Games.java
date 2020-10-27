package codechef;

import java.util.*;

public class Games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number : ");
		int n = sc.nextInt();sc.nextLine();
		
		int count=0;
		String[] names = new String[100];
		for(int i=0;;i++)
		{
			System.out.println("Name:");
			names[i] = sc.nextLine();
			count++;
			
			if(names[i].length()==1)
			{
				if((names[i].charAt(0)=='Q')||(names[i].charAt(0)=='q'))
					break;
			}
		}
		
		double[] height = new double[count];
		for(int j=0;j<count-1;j++)
		{
			System.out.println("Height:");
			height[j] = sc.nextDouble();
		}
		
		double temp = 0;
		String temp1 = null;
		for(int x=0;x<count-1;x++)
		{
			for(int y=0;y<count-2;y++)
			{
				if(height[y]<height[y+1])
				{
					temp = height[y];
					temp1 = names[y];
					height[y] = height[y+1];
					names[y] = names[y+1];
					height[y+1] = temp;
					names[y+1] = temp1;
				}
			}
		}
		
		for(int x=0;x<n;x++)
		{
			System.out.println(names[x]);
		}
	}

}
