import java.util.*;
public class Sticks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the test cases");// Enter the number of test cases
		int t=sc.nextInt();
		System.out.println("enter the length of sticks");
		for(int a=0;a<t;a++)
		{
			int n=sc.nextInt();
			int ab[]=new int[n];
			
			for(int i=0;i<n;i++)
			{
				ab[i]=sc.nextInt();//Enter the length of the sticks
			}
			
			int p=0;
			int area=1;// Initally area=1
			Arrays.sort(ab);// sort array values
			for(int i=n-1;i>0;i--)
			{
				if(ab[i]==ab[i-1])
				{
					p++;
					area=area*ab[i]; // rule of triangle two sides should have same length(axb), finding whether they have two sides with same length.
					i--;
				}
				
				
				 if(p==2)
			       {
			           System.out.println(area);
			           break;
			       }
			    }
			    if(p!=2)
			    {
			        System.out.println("-1");
			}
			
			
		}

	}

}

/*
 Pseudo code
 1.enter the length of stickle
 2.if two sides have same length then its a rectangle
 3.find area by multipling length and breadth(axb)
 
 
 
 logic
 1.find out if two length are same within given values.
 (ab[i]==ab[i-1])
 */

