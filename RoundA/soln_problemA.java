/* My solution to problem A - even digits
 * Link to full problem : https://code.google.com/codejam/contest/9234486/dashboard
 */

import java.util.*;
import java.io.*;

public class soln_problemA
{
	public static void main (String [] args) throws IOException
	{
		Scanner in = new Scanner(new File("input.txt"));
		int t = in.nextInt(); //reading integer input from file
		int num; 
		int result =0, div=0;
		for(int i=1; i<= t; i++)
		{
			num = in.nextInt();
			while(num > 0)
			{
				int digit = num % 10;
				if(( digit & 1) != 0) //checking if last digit of num is even
				{
					result= result + 10^div;
				}

				num=num/10;	
				div++; //number of times num has been divided by ten
			}
   		        System.out.println("Case #" + i + ": " +result);
			result=0;
			div=0;
		}
	}
}

