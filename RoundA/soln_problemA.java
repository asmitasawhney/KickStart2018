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
		int num, numCopy; 
		String plus="", minus="";
		int result =0, div=0;
	
		for(int i=1; i<= t; i++)
		{
			num = in.nextInt();
			numCopy= num;
			String str = String.valueOf(num);

			for (int j=0; j< str.length(); j++)
			{
				
				int digit = Character.getNumericValue(str.charAt(j)) ;
				if ((digit % 2) != 0)
				{
					minus = str.replace(str.charAt(j), (char) (digit -1) );
					plus = str.replace(str.charAt(j), (char) (digit+1) );
					
					for (int k=j+1; k<str.length(); k++)
					{
						minus = str.replace(str.charAt(k), '8');
						plus = str.replace (str.charAt(k), '0');
					}
					
					j= str.length() +1;
				}
			}

			if(plus != "")
			{	
				result = Integer.parseInt(plus) - num;
				int minusdiff = num - Integer.parseInt(minus);
				if (result > minusdiff)
					result = minusdiff;
			}
   		        System.out.println("Case #" + i + ": " +result);
			result=0;
		}
	}
}

//7013
//6888
//
//7712
//8000
//
//79
//80
//
//
