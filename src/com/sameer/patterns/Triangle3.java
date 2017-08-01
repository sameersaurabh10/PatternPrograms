package com.sameer.patterns;
/*WAP to print the following pattern
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
*/

public class  Triangle3
{
	public static void main(String[] args) 
	{
		int line;
		int star;
		int count=1;
		for(line=1;line<=5;line++)
		{
			for(star=1;star<=line;star++)
			{
				System.out.print(count+++" ");
			}
			System.out.println();
		}

	}
}
