/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungluas;

import java.util.Scanner;

/**
 *
 */
public class Luaslingkaran {
    public static void main(String[] args) {
   int jarijari;
   double luas;

   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Luas Lingkaran");
   System.out.print("Masukan Jari-Jari: ");
   jarijari = scan.nextInt();
  
   luas = 3.14 * (jarijari * jarijari);
   System.out.println("Luas Lingkaran= " +luas);
}
}
