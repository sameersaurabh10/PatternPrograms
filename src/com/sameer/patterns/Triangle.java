
package com.sameer.patterns;
/*
    WAP to print a right angle triangle using for loop
    *
    * *
    * * *
    * * * *
*/
public class  Triangle
{
    public static void main(String[] args) 
    {
        int line;
	int star;
	for(line=1;line<=5;line++)
	{
            for(star=1;star<=line;star++)
            {
		System.out.print("*");
            }
            System.out.println();
	}
    }
}
