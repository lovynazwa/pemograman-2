/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.stmikamik;

/**
 *
 * @author Tamu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle tahu = new Circle("Tahu Bulat", 2.5);
        
        System.out.println("Nama Benda: " + tahu.getName());
        System.out.println("Luasnya: " + tahu.getArea());
        
        Rectangle papan = new Rectangle("Tempe", 12, 4.3);
        
        System.out.println("Nama Benda: " + papan.getName());
        System.out.println("Luasnya: " + papan.getArea());
    }
    
}
