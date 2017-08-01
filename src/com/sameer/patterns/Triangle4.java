package com.sameer.patterns;
/*WAP to print the following pattern
                *
            *       *
        *       *       *
    *       *       *       *

*/
public class  Triangle4
{
    public static void main(String[] args) 
 	{
		int line;
		int star;
		int space;
		for(line=1;line<=5;line++)
		{
			
			for(space=1;space<=line-1;space++)
			{
				System.out.print(" ");
			}

			for(star=5;star>=line;star--)
			{
				System.out.print("* ");
			}
		
			System.out.println();
		}
	}
}
