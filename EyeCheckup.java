package codechef;

import java.util.*;

public class EyeCheckup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//System.out.println("number:");
		int N = sc.nextInt();
		int[] que1 = new int[N];
		int[] que2 = new int[N];
		int x=0,y=0;
		for(int i=0;i<N;i++)
		{
			//System.out.println("age"+i+":");
			int age = sc.nextInt();
			if((age>=60)&&(age<100))
			{
				que2[y++] = age;
			}
			else if((age>10)&&(age<60)||(y>4))
			{
				que1[x++] = age;
			}
			else
			{
				System.out.println("INVALID AGE");
				continue;
			}
			
		}
		
		System.out.println("QUEUE1 TIME:"+(x*15));
		System.out.println("QUEUE2 TIME:"+(y*15));
	}

}
