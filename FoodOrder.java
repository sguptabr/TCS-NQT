package codechef;

import java.util.*;

public class FoodOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count=1;
		String s1 = sc.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(s1.length());
		System.out.println(count);
		
	}

}

