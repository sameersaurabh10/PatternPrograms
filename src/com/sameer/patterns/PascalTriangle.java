package com.sameer.patterns;

/*WAP to display Pascal Triangle with specified size...
                1
             1      1
          1     2      1
        1    3      3     1
*/


import java.util.Scanner;


public class  PascalTriangle
{
    public static int pascalT(int row,int col)
    {
	if(col==1)
            return 1;
	else if(row==col)
            return 1;
        else
            return pascalT(row-1,col)+pascalT(row-1,col-1);

	}
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows...");
        int row=sc.nextInt();
        for (int i = 1; i <= row; i++) 
        {
            for (int j = row; j >=i+1 ; j--) 
            {
                System.out.print(" ");
            }
		
            for (int j = 1; j<=i; j++) 
            {
                System.out.print(pascalT(i, j)+" ");
            }
            System.out.println();
        }
    }
        
}
