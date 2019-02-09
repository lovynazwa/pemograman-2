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
public class Rectangle extends Shape{
    
    private String name;
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
