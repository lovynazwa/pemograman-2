/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungluas;

import java.util.Scanner;

/**
 */
public class HitungLuas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p;
        int l;
        try ( // TODO code application logic here
                Scanner scan = new Scanner (System.in)) {
            System.out.print("masukkan panjang (p):");
            p = scan.nextInt();
            System.out.print("masukkan lebar (l):");
            l = scan.nextInt();
        }
   double hasil=p*l;
   System.out.println("hasil jumlah "+p+" * "+l+" = "+hasil);
    }
    
}
