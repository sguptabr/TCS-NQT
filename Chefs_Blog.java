package codechef;

import java.util.*;

public class Chefs_Blog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int l = str.length();
		
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		
		for(int i=0;i<l;i++)
		{
			
			if(str.charAt(i)=='a')
			{
				count1 = count1 +1;
				//System.out.println(str.charAt(i)+":"+count1);
			}
			
			
			if(str.charAt(i)=='e')
			{
				count2 = count2+1;
				//System.out.println(str.charAt(i)+":"+count2);
			}
			
			//int count3=0;
			if(str.charAt(i)=='i')
			{
				count3=count3+1;
				//System.out.println(str.charAt(i)+":"+count3);
			}
			
			//int count4=0;
			if(str.charAt(i)=='o')
			{
				count4=count4+1;
				//System.out.println(str.charAt(i)+":"+count4);
			}
			
			//int count5=0;
			if(str.charAt(i)=='u')
			{
				count5=count5+1;
				//System.out.println(str.charAt(i)+":"+count5);
			}
		}
		
		System.out.println("a:"+count1);
		System.out.println("e:"+count2);
		System.out.println("i:"+count3);
		System.out.println("o:"+count4);
		System.out.println("u:"+count5);
		
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)!='a')&&(str.charAt(i)!='e')&&(str.charAt(i)!='o')&&(str.charAt(i)!='i')&&(str.charAt(i)!='u'))
			{
				System.out.print(str.charAt(i));
			}
		}
		
		
		
		}

}

