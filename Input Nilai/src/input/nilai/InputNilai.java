/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input.nilai;


import java.util.Scanner;

/**
 *
 * @author Lovynazwa
 */
public class InputNilai {
    private static Object system;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nilai;
        System.out.print("Masukkan Nilai anda : A/B/C/D/E");
        System.out.print("\n");
        nilai = input.nextLine();
        switch(nilai){
            case "A" :
                System.out.print("\nExcellent");
                break;
            case "B" :
                System.out.print("\nGood Job!");
                break;
            case "C" :
                System.out.print(nStudy Hard!);
                break;
            case "a" :
                System.out.print("\nExcellent");
                break;
            case "b" :
                System.out.print("\nGood Job!");
                break;
            case "c" :
                System.out.print("\nStudy Hard!");
                break;
            default :
                System.out.print("\nSorry, you failed.");
                break;
        }
        
    }
    
}
