package Segitiga_samakaki;

import java.util.Scanner;

/**
 *
 * @author Rina Septiana
 */
public class Segitiga_kananAtas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int i,j,k;
        
        boolean menu =true;
        while(menu)
        {
        System.out.print("Masukkan nilai x =");
             int x;
             x = scan.nextInt();
        
        	System.out.println("\nCetak Segitiga Siku Kanan Atas");
        	System.out.println("==========================");
                for(i=1;i<=5;i++)
                    {
                          for(k=1;k<=i;k++)
                          {
                          System.out.print(" ");
                          }
                          
                          for(j=5;j>=i;j--)
                          {
                          System.out.print("*");
                          }
                          System.out.println("");
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
    

