/* My solution to problem A - even digits
 * Link to full problem : https://code.google.com/codejam/contest/9234486/dashboard
 */

import java.util.*;
import java.io.*;

public soln_problemA
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); //reading integer input from file
			
		int num; 
		int result =0, div=0;
		for(int i=1; i<= t; i++)
		{
			num = in.nextInt();
			while(num > 0)
			{
				if(( (num % 10) % 2) != 0) //checking if last digit of num is even
				{
					
					result= result + 10^div;
					num=num/10;	
					div++; //number of times num has been divided by ten
				}

			}
   		        System.out.println("Case #" + i + ": " +result);
			result=0;
			div=0;
		}
	}
}

