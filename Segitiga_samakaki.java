package Segitiga_samakaki;

import java.util.Scanner;
public class Segitiga_samakaki {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        int x;
        
        boolean menu =true;
        while(menu)
        {
        	System.out.print("Masukkan nilai x =");
        	x = scan.nextInt();
        
        	System.out.println("\nCetak Segitiga Sama Kaki");
        	System.out.println("==========================");
        	for (int i=1;i<=x;i++)
			{
				for(int j=x-1;j>=i;j--)
				{ 
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{ 
					System.out.print("*");
				}
				for (int l=1;l<=i-1;l++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
        	
        	
        }   
    }
}
    

