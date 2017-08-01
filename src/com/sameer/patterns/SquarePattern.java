package com.sameer.patterns;
/*WAP to print a square pattern using for loop.
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
*/
public class SquarePattern 
{

    public static void main(String[] args) 
    {
        int line;
	int star;
	for(line=1;line<=3;line++)
	{
            for(star=1;star<=3;star++)
            {
                System.out.print("*");
            }
            System.out.println();
	}
    }
}
