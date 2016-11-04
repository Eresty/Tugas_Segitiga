package Segitiga_samakaki;

import java.util.Scanner;

/**
 *
 * @author Rina Septiana
 */
public class Segitiga_kananbawah {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        int x;
        
        boolean menu =true;
        while(menu)
        {
        	System.out.print("Masukkan nilai x =");
        	x = scan.nextInt();
        
        	System.out.println("\nCetak Segitiga  Siku Kanan Bawah");
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
				System.out.println();
			}
        	
        	System.out.print("\nIngin Mencoba lagi (Y/T) ?:");
        	String cek = scan.next();
        	
        	if(cek.equalsIgnoreCase("T")) {
                    
                    menu = false;
                    
                } else if(cek.equalsIgnoreCase("Y"))
                {
                    menu = true;
                }
                else
                    System.exit(0);
        }   
    }
    }
