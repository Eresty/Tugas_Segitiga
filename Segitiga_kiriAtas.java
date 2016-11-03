package Segitiga_samakaki;

import java.util.Scanner;

/**
 *
 * @author Rina Septiana
 */
public class Segitiga_kiriAtas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        
        boolean menu =true;
        while(menu)
        {
        	System.out.print("Masukkan nilai x =");
        	x = scan.nextInt();
        
        	System.out.println("\nCetak Segitiga Siku Kiri Atas");
        	System.out.println("==========================");
        	for (int k = 6; k > 0; k--) 
                {
                    for (int l = k; l > 0; l--) 
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
    

