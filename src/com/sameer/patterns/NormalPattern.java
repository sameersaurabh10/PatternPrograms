package com.sameer.patterns;
/*
    WAP to print Normal Pattern pattern...
            *
          *   *
        *   *   *
      *   *   *   *
*/
public class NormalPattern 
{
    public static void main(String[] args) 
    {
	int line;
	int star;
	int space;
	for(line=1;line<=5;line++)
	{
            for(space=5;space>line;space--)
            {
		System.out.print("&");
            }
            for(star=1;star<=line;star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
